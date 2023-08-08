package Sets.FindOperations.Contacts;

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

  @Override
  public String toString() {
    return "Contact{" +
        "name='" + name + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
  }
}
