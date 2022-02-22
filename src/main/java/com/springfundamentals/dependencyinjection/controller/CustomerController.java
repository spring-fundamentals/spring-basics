package com.springfundamentals.dependencyinjection.controller;

import com.springfundamentals.dependencyinjection.service.CustomerService;

public class CustomerController {

  public void deactivateCustomerAccount(String customerId) {
    CustomerService customerService = new CustomerService();
    customerService.deactivateCustomer(customerId);
  }
}
