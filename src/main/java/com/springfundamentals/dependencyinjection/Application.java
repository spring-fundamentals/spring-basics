package com.springfundamentals.dependencyinjection;

import com.springfundamentals.dependencyinjection.controller.CustomerController;
import com.springfundamentals.dependencyinjection.dataaccess.CustomerLoader;
import com.springfundamentals.dependencyinjection.service.CustomerService;
import com.springfundamentals.dependencyinjection.service.EmailService;
import com.springfundamentals.dependencyinjection.service.PostalService;

public class Application {

    public static void main(String[] args) {

        EmailService emailService = new EmailService();
        PostalService postalService = new PostalService();
        CustomerLoader customerLoader = new CustomerLoader();
        CustomerService customerService = new CustomerService(emailService, postalService, customerLoader);

        CustomerController customerController = new CustomerController(customerService);

        customerController.deactivateCustomerAccount("1");
    }

}
