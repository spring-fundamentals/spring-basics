package ch.mare.springfundamentals.profiles._02;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;
import ch.mare.springfundamentals.profiles._02.controller.CustomerController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

    CustomerController customerController = ctx.getBean(CustomerController.class);

    Customer customer = customerController.findCustomerAccountBy("1");

    System.out.println(customer);
  }
}
