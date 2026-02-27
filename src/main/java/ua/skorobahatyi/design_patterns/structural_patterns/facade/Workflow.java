package ua.skorobahatyi.design_patterns.structural_patterns.facade;

public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }

    public void closeProblems() {
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
