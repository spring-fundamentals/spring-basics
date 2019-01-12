package ch.mare.springfundamentals.dependencyinjection.di_02;

import ch.mare.springfundamentals.dependencyinjection.common.service.EmailService;
import ch.mare.springfundamentals.dependencyinjection.common.service.PostalService;
import ch.mare.springfundamentals.dependencyinjection.di_02.controller.CustomerController;
import ch.mare.springfundamentals.dependencyinjection.di_02.dataaccess.CustomerLoader;
import ch.mare.springfundamentals.dependencyinjection.di_02.service.CustomerService;

public class Application {

  public static void main(String[] args) {

    final CustomerLoader customerLoader = new CustomerLoader();
    final EmailService emailService = new EmailService();
    final PostalService postalService = new PostalService();

    final CustomerService customerService = new CustomerService(customerLoader, emailService, postalService);

    final CustomerController customerController = new CustomerController(customerService);

    customerController.deactivateCustomerAccount("1");
  }

}
