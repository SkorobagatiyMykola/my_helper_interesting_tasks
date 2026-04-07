package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.pass_param;

public class PassValue {

    public static void main(String[] args) {
        int localValue = 5;
        Integer localValue2 = 5;

        calculate(localValue);
        calculate2(localValue2);

        System.out.println(localValue);
        System.out.println(localValue2);
    }

    public static void calculate(int calcValue) {
        calcValue = calcValue * 1000;
    }

    public static void calculate2(Integer calcValue) {
        calcValue = calcValue * 1000;
    }

}
