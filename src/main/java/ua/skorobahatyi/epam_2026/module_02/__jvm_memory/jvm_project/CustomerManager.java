package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.jvm_project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.Thread.sleep;

public class CustomerManager {
    private List<Customer> customers = new ArrayList<>();
    private int nextId=0;

    public void addCustomer(Customer customer){
        synchronized (this){
            customer.setId(nextId);
            nextId++;
        }
        customers.add(customer);
    }

    public Customer getNextCustomer(){
        /*Customer result = null;
        synchronized (this){
            if (customers.size()>0){
                result = customers.remove(0);
            }
        }
        return result;*/
        return customers.get(0);
    }

    public void howManyCustomers() {
        int size = customers.size();
        System.out.println("Size :"+size+"  "+new Date());
    }

    public void displayCustomers(){
        synchronized (customers){
            for (Customer c: customers) {
                System.out.println(c.toString());
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
