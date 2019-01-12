package ch.mare.springfundamentals.dependencyinjection.di_02.dataaccess;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;

public class CustomerLoader {

  public Customer findById(String customerId) {
    return InMemoryDatabase.DATABASE.get(customerId);
  }
}
