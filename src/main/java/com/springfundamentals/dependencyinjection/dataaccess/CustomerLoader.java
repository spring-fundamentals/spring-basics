package com.springfundamentals.dependencyinjection.dataaccess;

import com.springfundamentals.dependencyinjection.domain.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerLoader {

    public Customer findById(String customerId) {
        return InMemoryDatabase.DATABASE.get(customerId);
    }
}
