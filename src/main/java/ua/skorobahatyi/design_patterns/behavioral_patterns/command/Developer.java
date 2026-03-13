package ua.skorobahatyi.design_patterns.behavioral_patterns.command;

public class Developer {
    private Command insert;
    private Command update;
    private Command select;
    private Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertCommand(){
        insert.execute();
    }

    public void selectCommand(){
        select.execute();
    }

    public void updateCommand(){
        update.execute();
    }

    public void deleteCommand(){
        delete.execute();
    }
}
