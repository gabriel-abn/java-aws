package Sets.FindOperations.TaskList;

import java.util.HashSet;

public class TaskList {
  private HashSet<Task> tasks;

  public TaskList() {
    this.tasks = new HashSet<>();
  }

  public void addTask(String task) {
    this.tasks.add(new Task(task));
  }

  public void removeTask(String task) {
    for (Task t : this.tasks) {
      if (t.getDescription().equals(task)) {
        this.tasks.remove(t);
        System.out.println("Task " + t + " removed");
        break;
      }
    }

    throw new IllegalArgumentException("Task " + task + " not found");
  }

  public void printTasks() {
    System.out.println("Tasks: " + this.tasks);
  }

  public int getNumberOfTasks() {
    return this.tasks.size();
  }

  public HashSet<Task> getDoneTasks() {
    HashSet<Task> doneTasks = new HashSet<>();

    for (Task t : this.tasks) {
      if (t.isDone()) {
        doneTasks.add(t);
      }
    }

    return doneTasks;
  }

  public HashSet<Task> getUndoneTasks() {
    HashSet<Task> undoneTasks = new HashSet<>();

    for (Task t : this.tasks) {
      if (!t.isDone()) {
        undoneTasks.add(t);
      }
    }

    return undoneTasks;
  }

  public void markTaskAsDone(String task) {
    for (Task t : this.tasks) {
      if (t.getDescription().equals(task)) {
        t.markAsDone();
        System.out.println("Task " + t + " marked as done");
        return;
      }
    }

    throw new IllegalArgumentException("Task " + task + " not found");
  }

  public void markTaskAsUndone(String task) {
    for (Task t : this.tasks) {
      if (t.getDescription().equals(task)) {
        t.markAsUndone();
        System.out.println("Task " + t + " marked as undone");
        return;
      }
    }

    throw new IllegalArgumentException("Task " + task + " not found");
  }

  public void markAllTasksAsDone() {
    for (Task t : this.tasks) {
      t.markAsDone();
    }
  }

  public void markAllTasksAsUndone() {
    for (Task t : this.tasks) {
      t.markAsUndone();
    }
  }

  public void removeDoneTasks() {
    HashSet<Task> doneTasks = this.getDoneTasks();

    for (Task t : doneTasks) {
      this.tasks.remove(t);
    }
  }

  public void removeAllTasks() {
    this.tasks.clear();
  }

  public static void main(String[] args) {
    TaskList taskList = new TaskList();

    taskList.addTask("Buy milk");
    taskList.addTask("Buy bread");
    taskList.addTask("Buy butter");
    taskList.addTask("Buy milk");

    taskList.printTasks();
    System.out.println("Number of tasks: " + taskList.getNumberOfTasks());

    taskList.markTaskAsDone("Buy milk");
    taskList.markTaskAsDone("Buy bread");
    taskList.markTaskAsDone("Buy butter");

    taskList.printTasks();
    System.out.println("Number of tasks: " + taskList.getNumberOfTasks());

    taskList.markTaskAsUndone("Buy milk");
    taskList.markTaskAsUndone("Buy bread");
    taskList.markTaskAsUndone("Buy butter");

    taskList.printTasks();
    System.out.println("Number of tasks: " + taskList.getNumberOfTasks());

    taskList.markAllTasksAsDone();

    taskList.printTasks();
    System.out.println("Number of tasks: " + taskList.getNumberOfTasks());

    taskList.markAllTasksAsUndone();

    taskList.printTasks();
    System.out.println("Number of tasks: " + taskList.getNumberOfTasks());

    taskList.removeDoneTasks();

    taskList.printTasks();
    System.out.println("Number of tasks: " + taskList.getNumberOfTasks());

    taskList.removeAllTasks();

    taskList.printTasks();
    System.out.println("Number of tasks: " + taskList.getNumberOfTasks());
  }
}
