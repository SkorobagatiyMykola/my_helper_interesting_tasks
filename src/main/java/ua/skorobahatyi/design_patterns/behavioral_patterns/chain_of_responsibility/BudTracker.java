package ua.skorobahatyi.design_patterns.behavioral_patterns.chain_of_responsibility;

public class BudTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK.", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong.", Priority.IMPORTANT);
        reportNotifier.notifyManager("Huston, we had a problem here !!!", Priority.ASAP);
    }
}
