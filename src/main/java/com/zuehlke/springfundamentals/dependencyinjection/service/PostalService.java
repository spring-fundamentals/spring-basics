package com.zuehlke.springfundamentals.dependencyinjection.service;

import com.zuehlke.springfundamentals.dependencyinjection.domain.MailingAddress;

public class PostalService {

  public void sendLetter(MailingAddress mailingAddress, String message) {
    System.out.println("A letter with the message '" + message + "' will be sent to " + mailingAddress);
  }
}
