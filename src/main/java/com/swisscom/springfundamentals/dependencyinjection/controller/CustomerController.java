package com.swisscom.springfundamentals.dependencyinjection.controller;

import com.swisscom.springfundamentals.dependencyinjection.service.CustomerService;

public class CustomerController {

  public void deactivateCustomerAccount(String customerId) {
    CustomerService customerService = new CustomerService();
    customerService.deactivateCustomer(customerId);
  }
}
