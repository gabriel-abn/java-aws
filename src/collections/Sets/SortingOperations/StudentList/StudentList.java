package collections.Sets.SortingOperations.StudentList;

import java.util.HashSet;
import java.util.TreeSet;

public class StudentList {
  private HashSet<Student> students;

  public StudentList() {
    this.students = new HashSet<Student>();
  }

  public void addStudent(String name, int grade, long enrollment) {
    this.students.add(new Student(name, grade, enrollment));
  }

  public void removeStudent(Long enrollment) {
    if (this.students.isEmpty()) {
      throw new RuntimeException("No students registered.");
    }

    for (Student s : this.students) {
      if (s.getEnrollment().equals(enrollment)) {
        this.students.remove(s);
        System.out.println("Student removed: " + s);
      }
    }
  }

  public void printStudents() {
    System.out.println("Students: " + this.students);
  }

  public void getStudentByName() {
    TreeSet<Student> studentsByName = new TreeSet<Student>(this.students);

    if (this.students.isEmpty()) {
      throw new RuntimeException("No students registered.");
    }

    System.out.println("Students by name: " + studentsByName);
  }

  public void listStudentsByGrade() {
    TreeSet<Student> studentsByGrade = new TreeSet<Student>(new CompareStudentsByGrade());

    if (this.students.isEmpty()) {
      throw new RuntimeException("No students registered.");
    }

    studentsByGrade.addAll(this.students);

    System.out.println("Students by grade: " + studentsByGrade);
  }

  public static void main(String[] args) {
    StudentList studentList = new StudentList();

    studentList.addStudent("John", 10, 123456789L);
    studentList.addStudent("Mary", 9, 987654321L);
    studentList.addStudent("Peter", 8, 123456789L);
    studentList.addStudent("Paul", 7, 987654321L);
    studentList.addStudent("Mary", 9, 123456789L);

    studentList.printStudents();
    studentList.getStudentByName();
    studentList.listStudentsByGrade();

    studentList.removeStudent(123456789L);
    studentList.printStudents();
  }
}
