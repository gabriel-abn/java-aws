package collections.Sets.FindOperations.Contacts;

import java.util.HashSet;

public class ContactsList {
  private HashSet<Contact> contacts;

  public ContactsList() {
    this.contacts = new HashSet<>();
  }

  public void addContact(Contact contact) {
    this.contacts.add(contact);
  }

  public void printContacts() {
    System.out.println("Contacts: " + this.contacts);
  }

  public HashSet<Contact> getContactByName(String name) {
    HashSet<Contact> contactsByName = new HashSet<>();

    if (this.contacts.isEmpty()) {
      throw new RuntimeException("No contacts registered.");
    }

    for (Contact contact : this.contacts) {
      if (contact.getName().equals(name)) {
        contactsByName.add(contact);
      }
    }

    return contactsByName;
  }

  public void updateContact(String name, String phoneNumber) {
    if (this.contacts.isEmpty()) {
      throw new RuntimeException("No contacts registered.");
    }

    for (Contact c : this.contacts) {
      if (c.getName().equalsIgnoreCase(name)) {
        c.setPhoneNumber(phoneNumber);
        System.out.println("Contact updated: " + c);
        break;
      }
    }
  }

  public static void main(String[] args) {
    ContactsList contactsList = new ContactsList();

    contactsList.addContact(new Contact("John", "1234567890"));
    contactsList.addContact(new Contact("Jane", "0987654321"));
    contactsList.addContact(new Contact("John", "1234567890"));
    contactsList.addContact(new Contact("Jane", "0987654321"));
    contactsList.addContact(new Contact("John", "1234567890"));

    contactsList.printContacts();

    System.out.println("Contacts by name: " + contactsList.getContactByName("John"));

    contactsList.updateContact("John", "1111111111");
    contactsList.updateContact("Jane", "2222222222");
    contactsList.updateContact("Jack", "3333333333");

    contactsList.printContacts();
  }
}
