package ch.mare.springfundamentals.dependencyinjection.common.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

  public void send(String emailAddress, String subject, String message) {
    System.out.println("Email has been sent to " + emailAddress);
  }
}
