package ua.skorobahatyi.design_patterns.structural_patterns.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems ...");
        } else {
            System.out.println("Developer is reading and learn English ...");
        }

    }
}
