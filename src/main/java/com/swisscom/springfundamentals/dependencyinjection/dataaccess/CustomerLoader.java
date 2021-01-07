package com.swisscom.springfundamentals.dependencyinjection.dataaccess;

import com.swisscom.springfundamentals.dependencyinjection.domain.Customer;

public class CustomerLoader {

  public Customer findById(String customerId) {
    return InMemoryDatabase.DATABASE.get(customerId);
  }
}
