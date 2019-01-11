package ch.mare.springfundamentals.dependencyinjection.di_03;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;
import ch.mare.springfundamentals.dependencyinjection.common.domain.MailingAddress;
import ch.mare.springfundamentals.dependencyinjection.common.service.EmailService;
import ch.mare.springfundamentals.dependencyinjection.common.service.PostalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  @Autowired
  private EmailService emailService;
  @Autowired
  private PostalService postalService;

  public void removeCustomerAccount(String customerId) {

    Customer customer = loadCustomerById(customerId);

    deactivate(customer);

    if (customer.hasEmailAddress()) {
      emailService.send(customer.getEmailAddress(), "Customer Account Removed", "Your customer account has been successfully removed!");
    }

    postalService.sendLetter(customer.getMailingAddress());
  }

  private Customer loadCustomerById(String customerId) {
    return new Customer("1", "Hans Wurst", new MailingAddress("Hauptstrasse 2", "Zürich"), "hans@wurst.ch") ;
  }

  private void deactivate(Customer customer) {
    customer.deactivate();
    //persist changes
  }
}
