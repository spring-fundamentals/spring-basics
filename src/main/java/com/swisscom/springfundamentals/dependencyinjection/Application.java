package com.swisscom.springfundamentals.dependencyinjection;

import com.swisscom.springfundamentals.dependencyinjection.controller.CustomerController;

public class Application {

  public static void main(String[] args) {

    CustomerController customerController = new CustomerController();

    customerController.deactivateCustomerAccount("1");
  }

}
