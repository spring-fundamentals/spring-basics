package ch.mare.springfundamentals.profiles._02.controller;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;
import ch.mare.springfundamentals.profiles._02.service.CustomerService;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  public Customer findCustomerAccountBy(String customerId) {
   return customerService.findCustomerAccountBy(customerId);
  }
}
