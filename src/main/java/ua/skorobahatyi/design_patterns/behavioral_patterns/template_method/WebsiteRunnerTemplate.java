package ua.skorobahatyi.design_patterns.behavioral_patterns.template_method;

public class WebsiteRunnerTemplate {
    public static void main(String[] args) {
        System.out.println("============");

        WebsiteTemplate newsPageTemplate = new NewsPageTemplate();
        WebsiteTemplate welcomePageTemplate = new WelcomePageTemplate();

        newsPageTemplate.showPage();


        System.out.println("\n=====================================\n");

        welcomePageTemplate.showPage();


    }
}
