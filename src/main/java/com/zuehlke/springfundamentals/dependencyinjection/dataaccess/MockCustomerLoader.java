package com.zuehlke.springfundamentals.dependencyinjection.dataaccess;

import com.zuehlke.springfundamentals.dependencyinjection.domain.Customer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
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
