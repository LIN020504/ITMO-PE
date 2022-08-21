package Command;

import Exceptions.ParaIncorrectException;
import Main.PackageCommand;
import Manager.CommandManager;

/**
 * The type Remove by id.
 */
public class RemoveByID extends AbstractCommand {
    /**
     * Instantiates a new Remove by id.
     */
    public RemoveByID() {
        this.name = "remove_by_id";
        this.description = "Remove an element from the collection by its id";
    }

    @Override
    public void execute(CommandManager commandManager, PackageCommand packageCommand) {
        if (Integer.parseInt(packageCommand.getCommandWithArgs()[1])<=0) {
            throw new ParaIncorrectException("Error [remove_by_id]: id should bigger than 0");
        } else {
            commandManager.executeRemoveByID(Long.valueOf(packageCommand.getCommandWithArgs()[1]));
        }
    }
}
