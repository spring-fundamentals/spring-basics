package com.swisscom.springfundamentals.dependencyinjection.controller;

import com.swisscom.springfundamentals.dependencyinjection.dataaccess.CustomerLoader;
import com.swisscom.springfundamentals.dependencyinjection.service.CustomerService;
import com.swisscom.springfundamentals.dependencyinjection.service.EmailService;
import com.swisscom.springfundamentals.dependencyinjection.service.PostalService;

public class CustomerController {

  private final EmailService emailService;
  private final PostalService postalService;
  private final CustomerLoader customerLoader;

  public CustomerController(EmailService emailService, PostalService postalService, CustomerLoader customerLoader) {
    this.emailService = emailService;
    this.postalService = postalService;
    this.customerLoader = customerLoader;
  }

  public void deactivateCustomerAccount(String customerId) {
    CustomerService customerService = new CustomerService(emailService, postalService, customerLoader);
    customerService.deactivateCustomer(customerId);
  }
}
