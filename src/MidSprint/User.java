package MidSprint;

public class User {
    private String name;
    private TaskList taskList;


    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTask(String description) {
        taskList.addTask(description);
    }

    public void markTaskAsCompleted(String description) {
        taskList.markTaskAsCompleted(description);
    }

    public void printTasks() {
        System.out.println("Tasks for " + name + ":");
        taskList.printTasks();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

