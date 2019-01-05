package ch.mare.springfundamentals.dependencyinjection.di_01;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;
import ch.mare.springfundamentals.dependencyinjection.common.service.EmailService;
import ch.mare.springfundamentals.dependencyinjection.common.service.PostalService;

public class CustomerService {

  public void removeCustomer(Customer customer) {

    deactivate(customer);

    if (customer.hasEmailAddress()) {
      EmailService emailService = new EmailService();
      emailService.send(customer.getEmailAddress(), "Customer Account", "Your customer account has been successfully removed");
    }

    PostalService postalService = new PostalService();
    postalService.sendLetter(customer.getMailingAddress());
  }

  private void deactivate(Customer customer) {
    customer.deactivate();
    //persist changes
  }
}
