package ua.skorobahatyi.design_patterns.behavioral_patterns.visitor;

public class Database implements ProjectElement{

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
