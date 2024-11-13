package MidSprint;

public class Task {
    private String description;
    private String isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = String.valueOf(false);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(String isCompleted) {
        this.isCompleted = isCompleted;
    }

    public void markAsCompleted(){
        this.isCompleted = String.valueOf(true);
    }

    public String isCompleted() {
        return isCompleted;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", isCompleted='" + isCompleted + '\'' +
                '}';
    }
}

