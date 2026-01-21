package ua.skorobahatyi.new_work_2025.insure;

public class Main {
    public static void main(String[] args) {
        User1 u1=new User1("Nick",18);
        User1 u2=new User1("Nick",18);

        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());

        System.out.println(u1.equals(u2));

        System.out.println(u1.toString());

        //47c68b0
        int decimalValue1 = Integer.parseInt("47c68b0", 16);
        System.out.println(decimalValue1);
    }
}
