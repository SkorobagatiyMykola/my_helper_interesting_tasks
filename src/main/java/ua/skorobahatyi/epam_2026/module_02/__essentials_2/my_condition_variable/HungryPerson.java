package ua.skorobahatyi.epam_2026.module_02.__essentials_2.my_condition_variable;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HungryPerson extends Thread {

    private int personID;
    private static Lock slowCookerLid = new ReentrantLock();
    private static int servings = 11;
    //private static Condition soupTaken =slowCookerLid.newCondition(); // added

    public HungryPerson(int personID) {
        this.personID = personID;
    }

    @Override
    public void run() {
        while (servings > 0) {
            slowCookerLid.lock();
            try {
                if ((personID == servings % 2) && servings > 0) {
                    servings--;
                    System.out.format("Person %d took some soup! Serving left: %d\n", personID, servings);
                } else {
                    System.out.format("Person %d checked ... then put the lid back.\n", personID);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                slowCookerLid.unlock();
            }
        }
    }
}


class ConditionVariableDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new HungryPerson(i).start();
        }
    }
}