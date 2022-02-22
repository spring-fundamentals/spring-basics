package com.springfundamentals.dependencyinjection;

import com.springfundamentals.dependencyinjection.controller.CustomerController;
import com.springfundamentals.dependencyinjection.dataaccess.CustomerLoader;
import com.springfundamentals.dependencyinjection.service.EmailService;
import com.springfundamentals.dependencyinjection.service.PostalService;

public class Application {

  public static void main(String[] args) {

    EmailService emailService = new EmailService();
    PostalService postalService = new PostalService();
    CustomerLoader customerLoader = new CustomerLoader();

    CustomerController customerController = new CustomerController(emailService, postalService, customerLoader);

    customerController.deactivateCustomerAccount("1");
  }

}
