package ch.mare.springfundamentals.dependencyinjection.common.domain;

public class MailingAddress {

  private String street;
  private String city;

  public MailingAddress(String street, String city) {
    this.street = street;
    this.city = city;
  }

  @Override
  public String toString() {
    return "MailingAddress{" +
        "street='" + street + '\'' +
        ", city='" + city + '\'' +
        '}';
  }
}
