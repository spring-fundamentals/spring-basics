package com.springfundamentals.dependencyinjection.controller;

import com.springfundamentals.dependencyinjection.service.CustomerService;
import org.springframework.stereotype.Component;

@Component
public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  public void deactivateCustomerAccount(String customerId) {
    customerService.deactivateCustomer(customerId);
  }
}
