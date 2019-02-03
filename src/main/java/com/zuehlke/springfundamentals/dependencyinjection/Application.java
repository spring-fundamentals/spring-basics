package com.zuehlke.springfundamentals.dependencyinjection;

import com.zuehlke.springfundamentals.dependencyinjection.controller.CustomerController;
import com.zuehlke.springfundamentals.dependencyinjection.dataaccess.CustomerLoader;
import com.zuehlke.springfundamentals.dependencyinjection.service.EmailService;
import com.zuehlke.springfundamentals.dependencyinjection.service.PostalService;

public class Application {

  public static void main(String[] args) {

    EmailService emailService = new EmailService();
    PostalService postalService = new PostalService();
    CustomerLoader customerLoader = new CustomerLoader();

    CustomerController customerController = new CustomerController(emailService, postalService, customerLoader);

    customerController.deactivateCustomerAccount("1");
  }

}
