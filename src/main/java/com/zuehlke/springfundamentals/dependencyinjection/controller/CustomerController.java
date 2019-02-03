package com.zuehlke.springfundamentals.dependencyinjection.controller;

import com.zuehlke.springfundamentals.dependencyinjection.dataaccess.CustomerLoader;
import com.zuehlke.springfundamentals.dependencyinjection.service.CustomerService;
import com.zuehlke.springfundamentals.dependencyinjection.service.EmailService;
import com.zuehlke.springfundamentals.dependencyinjection.service.PostalService;

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
