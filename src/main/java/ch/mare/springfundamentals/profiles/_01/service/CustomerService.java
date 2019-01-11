package ch.mare.springfundamentals.profiles._01.service;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;
import ch.mare.springfundamentals.profiles._01.dataaccess.CustomerLoader;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  private final CustomerLoader customerLoader;

  public CustomerService(CustomerLoader customerLoader) {
    this.customerLoader = customerLoader;
  }

  public Customer findCustomerAccountBy(String customerId) {
    return customerLoader.findById(customerId);
  }
}
