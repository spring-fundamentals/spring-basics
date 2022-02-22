package com.springfundamentals.dependencyinjection.dataaccess;

import com.springfundamentals.dependencyinjection.domain.Customer;

public interface CustomerLoader {

    Customer findById(String customerId);
}
