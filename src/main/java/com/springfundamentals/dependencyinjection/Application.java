package com.springfundamentals.dependencyinjection;

import com.dif.Box;

public class Application {

    public static void main(String[] args) {

        new Box("com.springfundamentals.dependencyinjection");

        //CustomerLoader customerLoader = new CustomerLoader();
        //EmailService emailService = new EmailService();
        //PostalService postalService = new PostalService();
        //CustomerService customerService = new CustomerService(customerLoader, emailService, postalService);
        //CustomerController customerController = new CustomerController(customerService);
//
        //customerController.deactivateCustomerAccount("1");
    }

}
