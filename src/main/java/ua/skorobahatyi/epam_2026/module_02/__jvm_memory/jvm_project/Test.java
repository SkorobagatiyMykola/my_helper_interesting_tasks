package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.jvm_project;

import static java.lang.Boolean.TRUE;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Integer a= 5;
        Integer a4= 5;
        Long a1= 5l;
        Long a11= Long.valueOf("5");
        Byte a2= 5;
        Short a3= 5;

        Character c1 = 'a';
        Character c2 = 'a';

        String s="123";

        Thread th = new Thread();
        th.join();

        System.out.println(Thread.currentThread().getName());
        System.out.println(th.getName());
        //th.getName()

        System.out.println(c1==c2);

        /*System.out.println(a==a1);
        System.out.println(a==a2);
        System.out.println(a==a3);*/
        System.out.println(a==a4);
        System.out.println(a1==a11);

     /*   while (true){
            a=7;
        }
*/

        /*while (true){
            for (int i = 0; i < 10_000_000; i++) {
                Customer customer = new Customer("test"+i);

            }
        }*/
    }
}
