package ua.skorobahatyi.help_for_numbers;


/**
 * Знайдіть двозначне число, сума цифр якого не змінюється при множенні на будь-яке однозначне число.
 * */
public class SymTwoDigit {
    public static void main(String[] args) {
        System.out.println(" ");
        checkSolution();
    }

    private static void checkSolution(){
        int[] arr = {123,2345,34,67,5444,100,600};

        for (int num:arr) {
            System.out.println(num+", sum digit:"+sumDigit(num));
        }
    }

    private static int sumDigit(int num){
        int sum =0;
        while (num>=10){
            int ost=num%10;
            sum+=ost;
            num=(num-ost)/10;

        }
        //System.out.println(num);
        return sum+num;
    }
}
