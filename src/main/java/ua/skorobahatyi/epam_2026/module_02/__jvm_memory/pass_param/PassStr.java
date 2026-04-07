package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.pass_param;

public class PassStr {

    // fixme very cool example which see how String is immutable
    public static void main(String[] args) {
       /* String s1 = "Test";
        System.out.println(s1);
        System.out.println("=============");
        changeStr(s1);
        System.out.println(s1);*/

        String name = "nick";
        System.out.println(name);
        name.toUpperCase();
        System.out.println(name);

        //System.out.println(StringPop);

    }

    private static void changeStr(String s) {
        s = s + "hello";
        System.out.println(s);
    }
}
