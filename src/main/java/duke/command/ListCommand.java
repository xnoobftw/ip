package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.task.Task;

public class ListCommand extends Command {

    /**
     * Constructs a ListCommand object with the input specified
     * @param input User's input that is processed by the ListCommand Object
     */
    public ListCommand(String input) {
        super(input);
    }

    /**
     * Invokes the ListCommand object to process the User's request based on User's input
     * @param tasks TaskList that contains an ArrayList of Task
     * @param ui Ui object that interacts with User
     * @param storage Storage object that reads from/write to specified filePath
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        tasks.sort();
        String message = "";
        message += "Here are the tasks in your list:\n";
        System.out.println("Here are the tasks in your list:");
        int index = 1;
        for (Task task : tasks.getList()) {
            System.out.println(index + ". " + task.toString());
            message += index + ". " + task.toString() + "\n";
            index++;
        }
        ui.setMessage(message);
    }

    /**
     * Returns false as ListCommand is not for termination
     * @return false
     */
    @Override
    public boolean isExit() {
        return false;
    }
}
