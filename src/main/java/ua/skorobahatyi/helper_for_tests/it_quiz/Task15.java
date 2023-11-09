package ua.skorobahatyi.helper_for_tests.it_quiz;

/**
 * The following code contains a process method which spawns a thread that performs a long-running operation,
 * and then performs a distinct long-running operation on the calling thread.
 * The doUnrelatedOperations method performs operations which are unrelated to the DataContainer class.
 *
 * Which of the following statements most accurately describes when the instance of DataContainer constructed in the main method will be garbage-collected?
 *
 *
 *
 *
 * The DataContainer instance will only be garbage-collected when the code calls the finalize method on it.
 * The DataContainer instance will be garbage-collected immediately after both doLongOperation and doAnotherLongOperation complete.
 * (!!!) The DataContainer instance will be garbage-collected no earlier than when dc.doAnotherLongOperation completes and may be collected at that time or later.
 * The DataContainer instance will be garbage-collected sometime after both doLongOperation and doAnotherLongOperation are complete. The exact time when it is garbage-collected is not guaranteed.
 *
 * */

public class Task15 {
    /*
    public static void main(String[] args) {
        process(new DataContainer());
        doUnrelatedOperations();
    }
    private static void process(DataContainer dc) {
        new Thread(() -> {
            dc.doLongOperation();
        }).start();
        dc.doAnotherLongOperation();
    }

     */
}
