package MidSprint;

public class TaskList {
    private static class Node {
        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }
    private Node head;

    public TaskList() {
        this.head = null;
    }

    // Add Task
    public void addTask(String description) {
        Task newTask = new Task(description);
        Node newNode = new Node(newTask);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Mark as complete
    public void markTaskAsCompleted(String description) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getDescription().equals(description)) {
                temp.task.markAsCompleted();
                System.out.println("Task marked as completed: " + description);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found: " + description);
    }

    public void printTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.task);
                temp = temp.next;
            }
        }
    }
}

