package com.zuehlke.springfundamentals.dependencyinjection.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

  public void send(String emailAddress, String subject, String message) {
    System.out.println("Email with subject '" + subject + "' has been sent to " + emailAddress);
  }
}
