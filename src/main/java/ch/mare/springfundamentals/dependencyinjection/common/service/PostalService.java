package ch.mare.springfundamentals.dependencyinjection.common.service;

import ch.mare.springfundamentals.dependencyinjection.common.domain.MailingAddress;
import org.springframework.stereotype.Component;

@Component
public class PostalService {

  public void sendLetter(MailingAddress mailingAddress) {
    System.out.println("A letter will be sent to " + mailingAddress);
  }
}
