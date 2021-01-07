package com.swisscom.springfundamentals.dependencyinjection.dataaccess;

import com.swisscom.springfundamentals.dependencyinjection.domain.Customer;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "customer.loader.mock", havingValue = "true")
public class MockCustomerLoader implements CustomerLoader {

  @Override
  public Customer findById(String customerId) {
    System.out.println("mock is active");
    return InMemoryDatabase.DATABASE.get(customerId);
  }
}
