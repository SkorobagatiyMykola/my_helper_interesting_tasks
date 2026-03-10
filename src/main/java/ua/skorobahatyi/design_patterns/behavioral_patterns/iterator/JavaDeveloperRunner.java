package ua.skorobahatyi.design_patterns.behavioral_patterns.iterator;


public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring","Hibernate", "Maven"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Mykola Skorobagatyi",skills);
        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("@");

    }
}
