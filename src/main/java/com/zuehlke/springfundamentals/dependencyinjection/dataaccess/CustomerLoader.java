package com.zuehlke.springfundamentals.dependencyinjection.dataaccess;

import com.zuehlke.springfundamentals.dependencyinjection.domain.Customer;

public class CustomerLoader {

  public Customer findById(String customerId) {
    return InMemoryDatabase.DATABASE.get(customerId);
  }
}
