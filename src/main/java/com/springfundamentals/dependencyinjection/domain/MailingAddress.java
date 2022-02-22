package com.springfundamentals.dependencyinjection.domain;

public class MailingAddress {

  private final String street;
  private final String city;

  public MailingAddress(String street, String city) {
    this.street = street;
    this.city = city;
  }

  @Override
  public String toString() {
    return street + ", " + city;
  }
}
