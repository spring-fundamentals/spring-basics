package com.zuehlke.springfundamentals.dependencyinjection.domain;

public class MailingAddress {

  private String street;
  private String city;

  public MailingAddress(String street, String city) {
    this.street = street;
    this.city = city;
  }

  @Override
  public String toString() {
    return street + ", " + city;
  }
}
