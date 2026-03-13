package ua.skorobahatyi.design_patterns.behavioral_patterns.command;

public class UpdateCommand implements Command{

    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
