package ua.skorobahatyi.design_patterns.behavioral_patterns.template_method;

public class WebsiteRunner {
    public static void main(String[] args) {
        WelcomePage welcomePage = new WelcomePage();
        NewsPage newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("\n============================\n");
        newsPage.showPage();

    }
}
