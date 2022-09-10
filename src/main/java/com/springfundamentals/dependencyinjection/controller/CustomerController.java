package com.springfundamentals.dependencyinjection.controller;

import com.springfundamentals.dependencyinjection.service.CustomerService;

public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService1) {
        customerService = customerService1;
    }

    public void deactivateCustomerAccount(String customerId) {
        customerService.deactivateCustomer(customerId);
    }
}
