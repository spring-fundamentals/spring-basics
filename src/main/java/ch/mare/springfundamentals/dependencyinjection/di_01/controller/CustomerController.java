package ch.mare.springfundamentals.dependencyinjection.di_01.controller;

import ch.mare.springfundamentals.dependencyinjection.di_01.service.CustomerService;

public class CustomerController {

  public void deactivateCustomerAccount(String customerId) {
    CustomerService customerService = new CustomerService();
    customerService.deactivateCustomer(customerId);
  }

}
