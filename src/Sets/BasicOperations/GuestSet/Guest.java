package Sets.BasicOperations.GuestSet;

public class Guest {
  private String name;
  private int code;

  public Guest(String name, int code) {
    this.name = name;
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public int getCode() {
    return code;
  }

  public boolean equals(Guest guest) {
    return this.name.equals(guest.getName());
  }

  public String toString() {
    return "Name: " + this.name + " Code: " + this.code;
  }
}
