package com.zuehlke.springfundamentals.dependencyinjection.dataaccess;

import com.zuehlke.springfundamentals.dependencyinjection.domain.Customer;

public interface CustomerLoader {

    Customer findById(String customerId);
}
