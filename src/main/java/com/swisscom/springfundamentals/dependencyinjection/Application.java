package com.swisscom.springfundamentals.dependencyinjection;

import com.swisscom.springfundamentals.dependencyinjection.controller.CustomerController;
import com.swisscom.springfundamentals.dependencyinjection.dataaccess.CustomerLoader;
import com.swisscom.springfundamentals.dependencyinjection.service.EmailService;
import com.swisscom.springfundamentals.dependencyinjection.service.PostalService;

public class Application {

  public static void main(String[] args) {

    EmailService emailService = new EmailService();
    PostalService postalService = new PostalService();
    CustomerLoader customerLoader = new CustomerLoader();

    CustomerController customerController = new CustomerController(emailService, postalService, customerLoader);

    customerController.deactivateCustomerAccount("1");
  }

}
