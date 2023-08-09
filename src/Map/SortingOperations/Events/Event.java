package Map.SortingOperations.Events;

public class Event {
  private String name;
  private String guest;

  public Event(String name, String guest) {
    this.name = name;
    this.guest = guest;
  }

  public String getName() {
    return this.name;
  }

  public String getGuest() {
    return this.guest;
  }

  @Override
  public String toString() {
    return "Event: " + this.name + ", Guest: " + this.guest;
  }
}
