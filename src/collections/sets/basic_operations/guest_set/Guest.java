package collections.sets.basic_operations.guest_set;

import java.util.Objects;

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

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Guest guest))
      return false;

    return getCode() == guest.getCode();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCode());
  }

  @Override
  public String toString() {
    return this.code + ": " + this.name;
  }
}
