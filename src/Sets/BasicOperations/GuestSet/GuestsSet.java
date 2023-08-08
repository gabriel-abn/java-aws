package Sets.BasicOperations.GuestSet;

import java.util.HashSet;

public class GuestsSet {
  private HashSet<Guest> guests;

  public GuestsSet() {
    this.guests = new HashSet<Guest>();
  }

  public void addGuest(Guest guest) {
    this.guests.add(guest);
  }

  public void removeGuestByCode(int code) {
    for (Guest guest : this.guests) {
      if (guest.getCode() == code) {
        this.guests.remove(guest);
        break;
      }
    }
  }

  public int getNumberOfGuests() {
    return this.guests.size();
  }

  public void printGuests() {
    for (Guest guest : this.guests) {
      System.out.println(guest);
    }
  }

  public static void main(String[] args) {
    GuestsSet guestsSet = new GuestsSet();

    guestsSet.addGuest(new Guest("Crazy Johnny", 1));
    guestsSet.addGuest(new Guest("Maria Beltronha", 2));
    guestsSet.addGuest(new Guest("Alaor", 3));
    guestsSet.addGuest(new Guest("Casimiro", 4));
    guestsSet.addGuest(new Guest("Pedro Pig", 5));
    guestsSet.addGuest(new Guest("Certezas", 6));
    guestsSet.addGuest(new Guest("Alvus", 7));
    guestsSet.addGuest(new Guest("Perani", 8));
    guestsSet.addGuest(new Guest("Honey Back", 9));
    guestsSet.addGuest(new Guest("Moedas", 10));

    guestsSet.printGuests();

    guestsSet.removeGuestByCode(5);

    System.out.println("Number of guests: " + guestsSet.getNumberOfGuests());

    guestsSet.printGuests();
  }
}
