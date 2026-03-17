package ua.skorobahatyi.design_patterns.behavioral_patterns.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Job");
        jobSite.addVacancy("Second Job");
        jobSite.addVacancy("Third Job");

        System.out.println("---------------------");
        Observer firstSubscriber = new Subscriber("Nick");
        Observer secondSubscriber = new Subscriber("Pasha");
        jobSite.addObserver(firstSubscriber);
        //jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy(" 4 java vacancy");

        jobSite.removeVacancy("Second Job");
        jobSite.addObserver(secondSubscriber);
        jobSite.addVacancy("Java Team Lead");

    }
}
