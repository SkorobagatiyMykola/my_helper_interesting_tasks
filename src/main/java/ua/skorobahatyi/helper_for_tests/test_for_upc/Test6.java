package ua.skorobahatyi.helper_for_tests.test_for_upc;

public class Test6 {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        a.x = 0;
        a.y = 0;
        a.cal(2, 3);
        b.x = 0;
        b.cal(3, 4);
        System.out.println(a.x + " " +b.y);
    }
}
class A {
    public int x;
    static int y;
    void cal (int a, int b) {
        x += a;
        y += b;
    }
}