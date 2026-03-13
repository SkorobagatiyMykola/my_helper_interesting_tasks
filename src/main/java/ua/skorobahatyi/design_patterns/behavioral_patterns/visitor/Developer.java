package ua.skorobahatyi.design_patterns.behavioral_patterns.visitor;

public interface Developer {
    void create(ProjectClass projectClass);
    void create(Database database);
    void create(Test test);
}
