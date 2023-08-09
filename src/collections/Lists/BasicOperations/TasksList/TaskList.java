package collections.Lists.BasicOperations.TasksList;

import java.util.ArrayList;

public class TaskList {
  private ArrayList<Task> tasks;

  public TaskList() {
    this.tasks = new ArrayList<Task>();
  }

  public void addTask(String description) {
    this.tasks.add(new Task(description));
  }

  public void removeTask(Task task) {
    this.tasks.remove(task);
  }

  public int size() {
    return this.tasks.size();
  }

  public void print() {
    for (Task task : this.tasks) {
      System.out.println(task.getDescription());
    }
  }

  public static void main(String[] args) {
    TaskList taskList = new TaskList();

    taskList.addTask("Buy milk");
    taskList.addTask("Buy eggs");
    taskList.addTask("Buy bread");
    taskList.addTask("Buy butter");
    taskList.addTask("Buy cheese");

    taskList.print();
    System.out.println("Size: " + taskList.size());

    taskList.removeTask(taskList.tasks.get(0));
    taskList.removeTask(taskList.tasks.get(0));

    taskList.print();

    System.out.println("Size: " + taskList.size());

  }
}
