package ua.skorobahatyi.design_patterns.behavioral_patterns.template_method;

public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("Header");
        showPageComtent();
        System.out.println("Footer");
    }

    public abstract void showPageComtent();
}
