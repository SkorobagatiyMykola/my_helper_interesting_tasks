package ua.skorobahatyi.design_patterns.behavioral_patterns.observer_epam;

public class Runner {
    public static void main(String[] args) {
        SimpleSubject subject = new SimpleSubject();

        Observer firstObserver = new SimpleObserver(subject);
        Observer secondObserver = new SimpleObserver(subject);

        subject.setValue(2);
        subject.setValue(3);
    }
}
