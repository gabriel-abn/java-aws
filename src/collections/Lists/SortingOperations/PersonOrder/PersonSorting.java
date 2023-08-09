package collections.Lists.SortingOperations.PersonOrder;

import java.util.ArrayList;

public class PersonSorting {
  ArrayList<Person> people;

  public PersonSorting() {
    this.people = new ArrayList<Person>();
  }

  public void addPerson(String name, int age, float height) {
    this.people.add(new Person(name, age, height));
  }

  public void print() {
    for (Person person : this.people) {
      System.out
          .println(person.getName() + " is " + person.getAge() + " years old and " + person.getHeight() + "m tall.");
    }
  }

  public void sortByAge() {
    this.people.sort(null);
  }

  public void sortByHeight() {
    this.people.sort(new PersonHeightComparator());
  }

  public static void main(String[] args) {
    PersonSorting personOrder = new PersonSorting();

    personOrder.addPerson("John", 25, 1.75f);
    personOrder.addPerson("Jane", 30, 1.65f);
    personOrder.addPerson("Jack", 20, 1.85f);
    personOrder.addPerson("Jill", 35, 1.55f);
    personOrder.addPerson("James", 40, 1.95f);

    personOrder.print();

    System.out.println("Sorting by age:");
    personOrder.sortByAge();
    personOrder.print();

    System.out.println("Sorting by height:");
    personOrder.sortByHeight();
    personOrder.print();
  }
}
