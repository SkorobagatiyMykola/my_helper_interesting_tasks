package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.jvm_project;

import java.util.UUID;

import static java.lang.Thread.sleep;

public class GenerateCustomerTask implements Runnable{

    private CustomerManager cm;
    private int totalCustomersGenerated =0;

    public GenerateCustomerTask(CustomerManager cm) {
        this.cm = cm;
    }

    @Override
    public void run() {
        while (true){
            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String name = new UUID(1l,10l).toString();
            Customer c = new Customer(name);
            cm.addCustomer(c);
            totalCustomersGenerated++;
            cm.getNextCustomer();
        }
    }
}
