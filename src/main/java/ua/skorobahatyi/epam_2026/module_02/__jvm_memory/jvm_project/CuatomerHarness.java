package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.jvm_project;

import static java.lang.Thread.sleep;

public class CuatomerHarness {
    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager();
        GenerateCustomerTask task = new GenerateCustomerTask(cm);
        for (int user = 0; user < 10; user++) {
            Thread t =new Thread(task);
            t.start();
        }

        while (true){
            for (int i = 0; i <1_000_000 ; i++) {
                Customer c1 = new Customer("123"+i);
            }
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            cm.howManyCustomers();
            System.out.println("Available memory: "+Runtime.getRuntime().freeMemory()/1024+"k");
        }
    }
}
