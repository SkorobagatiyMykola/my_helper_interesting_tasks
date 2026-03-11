package ua.skorobahatyi.design_patterns.behavioral_patterns.observer;

public interface Observed {
    public void addObserver(Observer observer);
    public void  removeObserver(Observer observer);

    public void notifyObservers();
}
