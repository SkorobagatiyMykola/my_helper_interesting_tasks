package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.pass_param;

public class PassObj {
    public static void main(String[] args) {
        Customer c = new Customer("Sally");
        renameCustomer(c);

        System.out.println(c.getName());

        final Customer c2 = new Customer("Sally 2");
        System.out.println(c2);
        c2.setName("Olga");
        System.out.println(c2);
    }

    public static void renameCustomer(Customer customer) {
        customer.setName("Nick");
    }

    private static class Customer {
        private String name;

        public Customer(String sally) {
            name = sally;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
