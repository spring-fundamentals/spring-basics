package com.swisscom.springfundamentals.dependencyinjection.domain;

public class Customer {

  private String id;
  private String name;
  private MailingAddress mailingAddress;
  private String emailAddress;

  public Customer(String id, String name, MailingAddress mailingAddress, String emailAddress) {
    this.id = id;
    this.name = name;
    this.mailingAddress = mailingAddress;
    this.emailAddress = emailAddress;
  }

  public boolean hasEmailAddress() {
    return emailAddress != null && !emailAddress.isEmpty();
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public MailingAddress getMailingAddress() {
    return mailingAddress;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", mailingAddress=" + mailingAddress +
        ", emailAddress='" + emailAddress + '\'' +
        '}';
  }
}
