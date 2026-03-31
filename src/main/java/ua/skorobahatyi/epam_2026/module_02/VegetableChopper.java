package ua.skorobahatyi.epam_2026.module_02;

import static java.lang.Thread.sleep;

public class VegetableChopper extends Thread {
    public int vegetable_count = 0;
    public static boolean chopping = true;

    public VegetableChopper(String name) {
        this.setName(name);
    }

    public void run() {
        while (chopping) {
            System.out.println(this.getName() + " chopped a vegetable!");
            vegetable_count++;
        }
    }
}

class ExecutionSchedulingDemo {
    public static void main(String[] args) throws InterruptedException {
        VegetableChopper barron = new VegetableChopper("Barron");
        VegetableChopper olivia = new VegetableChopper("Olivia");

        barron.start();
        olivia.start();
        sleep(1000);
        VegetableChopper.chopping = false;

        barron.join();
        olivia.join();
        System.out.format("Barron chopped %d vegetables. \n", barron.vegetable_count);
        System.out.format("Olivia chopped %d vegetables. \n", olivia.vegetable_count);
    }
}
