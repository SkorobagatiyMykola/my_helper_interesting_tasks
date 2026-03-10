package ua.skorobahatyi.design_patterns.structural_patterns.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        System.out.println("===================");
        Project project = new ProxyProject("https://www.github.com/mskorobagatyi");

        project.run();
    }
}
