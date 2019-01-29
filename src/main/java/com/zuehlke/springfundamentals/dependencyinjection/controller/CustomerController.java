package com.zuehlke.springfundamentals.dependencyinjection.controller;

import com.zuehlke.springfundamentals.dependencyinjection.service.CustomerService;

public class CustomerController {

  public void deactivateCustomerAccount(String customerId) {
    CustomerService customerService = new CustomerService();
    customerService.deactivateCustomer(customerId);
  }
}
