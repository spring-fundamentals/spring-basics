package com.springfundamentals.dependencyinjection.service;

public class EmailService {

  public void send(String emailAddress, String subject, String message) {
    System.out.println("Email with subject '" + subject + "' has been sent to " + emailAddress);
  }
}
