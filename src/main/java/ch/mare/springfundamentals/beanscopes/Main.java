package ch.mare.springfundamentals.beanscopes;

import ch.mare.springfundamentals.dependencyinjection.di_03.CustomerController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

    CustomerController customerController = ctx.getBean(CustomerController.class);

    customerController.removeCustomerAccount("123");
  }
}
