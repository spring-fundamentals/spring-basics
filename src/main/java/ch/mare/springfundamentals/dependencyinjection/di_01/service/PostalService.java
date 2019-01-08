package ch.mare.springfundamentals.dependencyinjection.di_01.service;

import ch.mare.springfundamentals.dependencyinjection.common.domain.MailingAddress;
import org.springframework.stereotype.Component;

//TODO: better naming?
public class PostalService {

  public void sendLetter(MailingAddress mailingAddress) {
    System.out.println("A letter will be sent to " + mailingAddress);
  }
}
