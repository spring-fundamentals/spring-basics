package com.swisscom.springfundamentals.dependencyinjection.dataaccess;

import com.swisscom.springfundamentals.dependencyinjection.domain.Customer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "customer.loader.mock", havingValue = "false")
public class RemoteCustomerLoader implements CustomerLoader {

  @Override
  public Customer findById(String customerId) {

    System.out.println("making a remote call to url: ...");

    return InMemoryDatabase.DATABASE.get(customerId);
  }
}
