package com.springfundamentals.dependencyinjection.dataaccess;

import com.springfundamentals.dependencyinjection.domain.Customer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
// Does anyone know why this is pretty good (maybe even better) alternative to profiles?
@ConditionalOnProperty(name = "customer.loader.mock", havingValue = "false")
public class RemoteCustomerLoader implements CustomerLoader {

    @Override
    public Customer findById(String customerId) {

        System.out.println("making a remote call to url: ...");

        return InMemoryDatabase.DATABASE.get(customerId);
    }
}
