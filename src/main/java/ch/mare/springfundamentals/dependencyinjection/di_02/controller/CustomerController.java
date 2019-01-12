package ch.mare.springfundamentals.dependencyinjection.di_02.controller;

import ch.mare.springfundamentals.dependencyinjection.di_02.service.CustomerService;

public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  public void deactivateCustomerAccount(String customerId) {
    customerService.deactivateCustomer(customerId);
  }

}
