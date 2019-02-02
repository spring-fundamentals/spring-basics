package com.zuehlke.springfundamentals.dependencyinjection;

import com.zuehlke.springfundamentals.dependencyinjection.controller.CustomerController;

public class Application {

  public static void main(String[] args) {

    CustomerController customerController = new CustomerController();

    customerController.deactivateCustomerAccount("1");
  }

}
