package com.springfundamentals.dependencyinjection.dataaccess;

import com.springfundamentals.dependencyinjection.domain.Customer;

public class CustomerLoader {

    public Customer findById(String customerId) {
        return InMemoryDatabase.DATABASE.get(customerId);
    }
}
