package ch.mare.springfundamentals.dependencyinjection.di_02.service;

import ch.mare.springfundamentals.dependencyinjection.common.domain.MailingAddress;

//TODO: better naming?
public class PostalService {

  public void sendLetter(MailingAddress mailingAddress) {
    System.out.println("A letter will be sent to " + mailingAddress);
  }
}
