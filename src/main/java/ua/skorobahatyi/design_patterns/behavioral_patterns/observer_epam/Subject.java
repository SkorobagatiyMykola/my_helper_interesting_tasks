package ua.skorobahatyi.design_patterns.behavioral_patterns.observer_epam;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
