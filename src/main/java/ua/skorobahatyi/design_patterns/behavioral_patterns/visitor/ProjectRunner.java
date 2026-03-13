package ua.skorobahatyi.design_patterns.behavioral_patterns.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer juniorDeveloper = new JuniorDeveloper();
        Developer seniorDeveloper = new SeniorDeveloper();

        System.out.println("Junior in Action ...");
        project.beWritten(juniorDeveloper);

        System.out.println("\n==========================\nSenior in Action ...");
        project.beWritten(seniorDeveloper);

    }
}
