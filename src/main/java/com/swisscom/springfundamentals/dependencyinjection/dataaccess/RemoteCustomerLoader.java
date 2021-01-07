package com.swisscom.springfundamentals.dependencyinjection.dataaccess;

import com.acme.customermasterdata.api.CmdCustomerDto;
import com.acme.customermasterdata.api.CustomerMasterDataClient;
import com.swisscom.springfundamentals.dependencyinjection.domain.Customer;
import com.swisscom.springfundamentals.dependencyinjection.domain.MailingAddress;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class RemoteCustomerLoader implements CustomerLoader {

  private final CustomerMasterDataClient customerMasterDataClient;

  public RemoteCustomerLoader(CustomerMasterDataClient customerMasterDataClient) {
    this.customerMasterDataClient = customerMasterDataClient;
  }

  @Override
  public Customer findById(String customerId) {
    CmdCustomerDto loadedCustomer = customerMasterDataClient.findById(customerId);

    return new Customer(loadedCustomer.getId(),
        loadedCustomer.getName(),
        new MailingAddress(loadedCustomer.getStreet(), loadedCustomer.getCity()),
        loadedCustomer.getEmailAddress());
  }
}
