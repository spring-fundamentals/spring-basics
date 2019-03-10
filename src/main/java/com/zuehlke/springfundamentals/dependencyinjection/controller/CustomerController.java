package com.zuehlke.springfundamentals.dependencyinjection.controller;

import com.zuehlke.springfundamentals.dependencyinjection.service.CustomerService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  public void deactivateCustomerAccount(String customerId) {
    customerService.deactivateCustomer(customerId);
  }
}
