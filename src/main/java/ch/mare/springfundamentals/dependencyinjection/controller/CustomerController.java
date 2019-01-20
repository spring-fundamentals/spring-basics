package ch.mare.springfundamentals.dependencyinjection.controller;

import ch.mare.springfundamentals.dependencyinjection.service.CustomerService;

public class CustomerController {

  public void deactivateCustomerAccount(String customerId) {
    CustomerService customerService = new CustomerService();
    customerService.deactivateCustomer(customerId);
  }

}
