package ch.mare.springfundamentals.dependencyinjection.di_01;

import ch.mare.springfundamentals.dependencyinjection.di_01.controller.CustomerController;

public class Application {

  public static void main(String[] args) {
    CustomerController customerController = new CustomerController();
    customerController.deactivateCustomerAccount("1");
  }

}
