package collections.lists.sorting_operations.person_sorting;

import java.util.Comparator;

public class PersonHeightComparator implements Comparator<Person> {

  @Override
  public int compare(Person person1, Person person2) {
    if (person1.getHeight() < person2.getHeight()) {
      return -1;
    } else if (person1.getHeight() > person2.getHeight()) {
      return 1;
    } else {
      return 0;
    }
  }
}
