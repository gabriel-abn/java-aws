package Sets.FindOperations.Contacts;

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

  public void checkContact(String name) {
    Contact contact = new Contact(name, "");

    if (this.contacts.contains(contact)) {
      System.out.println("Contact " + contact + " is in the set");
    } else {
      System.out.println("Contact " + contact + " is not in the set");
    }
  }

  public void updateContact(String name, String phoneNumber) {
    Contact contact = new Contact(name, "");

    if (this.contacts.contains(contact)) {
      this.contacts.remove(contact);

      Contact newContact = new Contact(name, phoneNumber);

      this.contacts.add(newContact);
      System.out.println("Contact " + contact + " updated to " + newContact);
    } else {
      System.out.println("Contact " + contact + " is not in the set");
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

    contactsList.checkContact("John");
    contactsList.checkContact("Jane");
    contactsList.checkContact("Jack");

    contactsList.updateContact("John", "1111111111");
    contactsList.updateContact("Jane", "2222222222");
    contactsList.updateContact("Jack", "3333333333");

    contactsList.printContacts();
  }
}
