package ua.skorobahatyi.helper_for_tests.it_quiz;


/**
 * https://app.itsquiz.com/account-report/654cc83b48c6ec8d8bdd36c4
 *
 * What is the output of the following code?
 *
 * A B C D
 * B D A C   (!!!)
 * A C B D
 * C D A B
 *
 */
public class Tas1 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

class Parent {
    {
        System.out.print("A ");
    }

    static {
        System.out.print("B ");
    }
}

class Child extends Parent {
    {
        System.out.print("C ");
    }

    static {
        System.out.print("D ");
    }
}
