package ch.mare.springfundamentals.dependencyinjection.di_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  public void removeCustomerAccount(String customerId) {
   customerService.removeCustomerAccount(customerId);
  }
}
