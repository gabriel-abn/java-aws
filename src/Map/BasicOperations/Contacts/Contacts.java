package Map.BasicOperations.Contacts;

import java.util.HashMap;

public class Contacts {
  private HashMap<String, String> contacts;

  public Contacts() {
    this.contacts = new HashMap<String, String>();
  }

  public void addContact(String name, String number) {
    this.contacts.put(name, number);
  }

  public void removeContact(String name) {
    if (this.contacts.isEmpty()) {
      throw new RuntimeException("The contacts list is empty");
    }

    this.contacts.remove(name);
  }

  public void printContacts() {
    if (this.contacts.isEmpty()) {
      throw new RuntimeException("The contacts list is empty");
    }

    System.out.println("Contacts: ");
    for (String name : this.contacts.keySet()) {
      System.out.println(name + ": " + this.contacts.get(name));
    }
  }

  public void updateContact(String name, String number) {
    if (this.contacts.isEmpty()) {
      throw new RuntimeException("The contacts list is empty");
    }

    this.contacts.replace(name, number);
  }

  public String getContact(String name) {
    if (this.contacts.isEmpty()) {
      throw new RuntimeException("The contacts list is empty");
    }

    return this.contacts.get(name);
  }
}
