package collections.Sets.SortingOperations.StudentList;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
  private String name;
  private int grade;
  private Long enrollment;

  public Student(String name, int age, long enrollment) {
    this.name = name;
    this.grade = age;
    this.enrollment = enrollment;
  }

  public String getName() {
    return this.name;
  }

  public int getGrade() {
    return this.grade;
  }

  public Long getEnrollment() {
    return this.enrollment;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (!(obj instanceof Student student)) {
      return false;
    }

    return this.enrollment.equals(student.getEnrollment());
  }

  @Override
  public int compareTo(Student student) {
    return this.name.compareTo(student.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.enrollment);
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + grade +
        '}';
  }
}

class CompareStudentsByGrade implements Comparator<Student> {
  @Override
  public int compare(Student student1, Student student2) {
    return Integer.compare(student1.getGrade(), student2.getGrade());
  }
}