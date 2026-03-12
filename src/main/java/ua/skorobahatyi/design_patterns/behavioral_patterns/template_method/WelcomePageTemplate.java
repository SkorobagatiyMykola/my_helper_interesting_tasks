package ua.skorobahatyi.design_patterns.behavioral_patterns.template_method;

public class WelcomePageTemplate extends WebsiteTemplate{

    @Override
    public void showPageComtent() {
        System.out.println("=== Welcome context ==");
    }
}
