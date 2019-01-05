package ch.mare.springfundamentals.dependencyinjection.di_02;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;
import ch.mare.springfundamentals.dependencyinjection.common.service.EmailService;
import ch.mare.springfundamentals.dependencyinjection.common.service.PostalService;

public class CustomerService {

  private EmailService emailService;
  private PostalService postalService;

  public CustomerService(EmailService emailService, PostalService postalService) {
    this.emailService = emailService;
    this.postalService = postalService;
  }

  public void removeCustomerAccount(Customer customer) {

    deactivate(customer);

    if (customer.hasEmailAddress()) {
      emailService.send(customer.getEmailAddress(), "Customer Account Removed", "Your customer account has been successfully removed!");
    }

    postalService.sendLetter(customer.getMailingAddress());
  }

  private void deactivate(Customer customer) {
    customer.deactivate();
    //persist changes
  }
}
