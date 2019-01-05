package ch.mare.springfundamentals.dependencyinjection.common.domain;

public class Customer {

  public boolean hasEmailAddress() {
    return true;
  }

  public String getEmailAddress() {
    return "hans@wurst.com";
  }

  public MailingAddress getMailingAddress() {
    return new MailingAddress();
  }

  public void deactivate() {
    System.out.println("Customer has been deactivated.");
  }
}
