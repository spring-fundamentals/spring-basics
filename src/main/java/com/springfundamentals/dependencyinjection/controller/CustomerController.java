package com.springfundamentals.dependencyinjection.controller;

import com.springfundamentals.dependencyinjection.service.CustomerService;

public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void deactivateCustomerAccount(String customerId) {
        CustomerService customerService = this.customerService;
        customerService.deactivateCustomer(customerId);
    }
}
