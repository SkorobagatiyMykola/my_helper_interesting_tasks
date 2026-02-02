package ua.skorobahatyi.help_for_numbers;

/**
 * Calculate E
 * */
 */
public class Calculate_E {
    public static void main(String[] args) {
        System.out.println(calculate_E_v1(1));
        System.out.println(calculate_E_v1(4));
        System.out.println(calculate_E_v1(100));
        System.out.println(calculate_E_v1(1000));
        System.out.println(calculate_E_v1(10000));
        System.out.println(calculate_E_v1(1_000_000));
        System.out.println(calculate_E_v1(1_000_000_0));
        System.out.println(calculate_E_v1(1_000_000_000));
        System.out.println(calculate_E_v1(Integer.MAX_VALUE));

    }

    private static double calculate_E_v1(int n){

        double e=Math.pow(1+ (double)1/n,n);
        return e;
    }
}
