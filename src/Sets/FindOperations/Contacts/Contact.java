package Sets.FindOperations.Contacts;

import java.util.Objects;

public class Contact {
  private String name;
  private String phoneNumber;

  public Contact(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return this.name;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (!(obj instanceof Contact contact)) {
      return false;
    }

    return Objects.equals(getName(), contact.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }

  @Override
  public String toString() {
    return "Contact{" +
        "name='" + name + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
  }
}
