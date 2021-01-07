package com.swisscom.springfundamentals.dependencyinjection.dataaccess;

import com.swisscom.springfundamentals.dependencyinjection.domain.Customer;
import org.springframework.stereotype.Component;

@Component
public class RemoteCustomerLoader implements CustomerLoader {

    @Override
    public Customer findById(String customerId) {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return InMemoryDatabase.DATABASE.get(customerId);
    }
}
