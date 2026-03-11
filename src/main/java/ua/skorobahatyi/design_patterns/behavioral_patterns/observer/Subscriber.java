package ua.skorobahatyi.design_patterns.behavioral_patterns.observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vscsncies: \n" + vacancies+
                "\n==========================================\n");


    }
}
