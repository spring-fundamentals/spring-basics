package com.springfundamentals.dependencyinjection.dataaccess;

import com.acme.customermasterdata.api.CmdCustomerDto;
import com.acme.customermasterdata.api.CustomerMasterDataClient;
import com.springfundamentals.dependencyinjection.domain.Customer;
import com.springfundamentals.dependencyinjection.domain.MailingAddress;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
// Does anyone know why this is pretty good (maybe even better) alternative to profiles?
@ConditionalOnProperty(name = "customer.loader.mock", havingValue = "false")
public class RemoteCustomerLoader implements CustomerLoader {

    private final CustomerMasterDataClient customerMasterDataClient;

    public RemoteCustomerLoader(CustomerMasterDataClient customerMasterDataClient) {
        this.customerMasterDataClient = customerMasterDataClient;
    }

    @Override
    public Customer findById(String customerId) {
        System.out.println("making a remote call.");

        CmdCustomerDto customerDto = customerMasterDataClient.findById(customerId);

        return new Customer(
                customerDto.getId(),
                customerDto.getName(),
                new MailingAddress(customerDto.getStreet(), customerDto.getCity()),
                customerDto.getEmailAddress()
        );
    }
}
