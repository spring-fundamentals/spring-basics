package com.springfundamentals.dependencyinjection;

import com.springfundamentals.dependencyinjection.controller.CustomerController;
import com.springfundamentals.dependencyinjection.dataaccess.CustomerLoader;
import com.springfundamentals.dependencyinjection.service.CustomerService;
import com.springfundamentals.dependencyinjection.service.EmailService;
import com.springfundamentals.dependencyinjection.service.PostalService;

public class Application {

    public static void main(String[] args) {

        CustomerLoader customerLoader = new CustomerLoader();
        EmailService emailService = new EmailService();
        PostalService postalService = new PostalService();
        CustomerService customerService = new CustomerService(customerLoader, emailService, postalService);
        CustomerController customerController = new CustomerController(customerService);

        customerController.deactivateCustomerAccount("1");
    }

}
