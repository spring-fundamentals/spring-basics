package ch.mare.springfundamentals.dependencyinjection.dataaccess;

import ch.mare.springfundamentals.dependencyinjection.domain.Customer;

public class CustomerLoader {

  public Customer findById(String customerId) {
    return InMemoryDatabase.DATABASE.get(customerId);
  }
}
