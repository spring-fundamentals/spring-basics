package com.swisscom.springfundamentals.dependencyinjection.dataaccess;

import com.swisscom.springfundamentals.dependencyinjection.domain.Customer;

public interface CustomerLoader {

    Customer findById(String customerId);
}
