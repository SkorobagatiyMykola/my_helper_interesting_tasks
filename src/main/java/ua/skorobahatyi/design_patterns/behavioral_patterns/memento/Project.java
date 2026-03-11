package ua.skorobahatyi.design_patterns.behavioral_patterns.memento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    public void setVersionAndDate(String version){
        this.version =version;
        this.date= new Date();

    }
}