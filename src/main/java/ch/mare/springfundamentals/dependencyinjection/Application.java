package ch.mare.springfundamentals.dependencyinjection;

import ch.mare.springfundamentals.dependencyinjection.controller.CustomerController;

public class Application {

  public static void main(String[] args) {

    CustomerController customerController = new CustomerController();

    customerController.deactivateCustomerAccount("1");
  }

}
