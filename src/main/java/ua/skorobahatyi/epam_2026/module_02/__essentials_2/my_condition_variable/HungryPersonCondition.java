package ua.skorobahatyi.epam_2026.module_02.__essentials_2.my_condition_variable;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HungryPersonCondition extends Thread {
    private int personID;
    private static Lock slowCookerLid = new ReentrantLock();
    private static int servings = 11;
    private static Condition soupTaken = slowCookerLid.newCondition(); // added

    public HungryPersonCondition(int personID) {
        this.personID = personID;
    }

    @Override
    public void run() {
        while (servings > 0) {
            slowCookerLid.lock();
            try {
                while ((personID != servings % 5) && servings > 0) {
                    System.out.format("! Person %d checked ... then put the lid back.\n", personID);
                    soupTaken.await();
                }
                if (servings > 0) {
                    servings--;
                    System.out.format("! Person %d took some soup! Serving left: %d\n", personID, servings);
                    //soupTaken.signal();
                    soupTaken.signalAll();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                slowCookerLid.unlock();
            }
        }
    }
}

class ConditionVariableDemoNew {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new HungryPersonCondition(i).start();
        }
    }
}