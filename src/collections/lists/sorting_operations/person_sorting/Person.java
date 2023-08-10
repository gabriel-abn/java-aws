package collections.lists.sorting_operations.person_sorting;

public class Person implements Comparable<Person> {
  private String name;
  private int age;
  private float height;

  public Person(String name, int age, float height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public float getHeight() {
    return this.height;
  }

  @Override
  public int compareTo(Person person) {
    if (this.age < person.getAge()) {
      return -1;
    } else if (this.age > person.getAge()) {
      return 1;
    } else {
      return 0;
    }
  }
}
