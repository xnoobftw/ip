package duke.Task;

public class Task {
    private final String taskDescription;
    private boolean isDone;

    public Task(String task) {
        this.taskDescription = task;
        this.isDone = false;
    }

    public String getTaskDescription() {
        return this.taskDescription;
    }

    public boolean isCompleted() {
        return this.isDone;
    }

    public void completeTask() {
        this.isDone = true;
    }

    public String toString() {
        return "[" + (this.isDone ? "\u2713" : "\u2717") + "] " + this.taskDescription;
    }
}
