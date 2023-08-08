package ua.skorobahatyi.games.bulls_and_cows;

import java.util.*;

import static ua.skorobahatyi.games.bulls_and_cows.Color.*;

public class Bulls_and_Cows {
    public static void main(String[] args) {

        String target = generateTask();

        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_BLUE + "Start game" + ANSI_RESET);

        while (true) {
            System.out.print("Input your variant: ");
            String opt = scanner.next();
            if (opt.equals(target)) {
                System.out.println(ANSI_RED +"Yes, you win, congratulation. " + opt + " is correct"+ANSI_RESET);
                break;
            }
            if (opt.equals("give up")||(opt.equals("cansel"))) {
                System.out.println(ANSI_RED + "Seek number was: "+target + ANSI_RESET);
                break;
            }

            System.out.print("Bulls: " + countBulls(opt, target) + ", Cows: " + countCowsUk(opt, target) + ". ");
            System.out.println("Try again...");
        }

        System.out.println(ANSI_RED + "==== THE END =====" + ANSI_RESET);


    }

    private static void testCase() {
        String target = "1234";
        String opt1 = "1234";
        String opt2 = "4321";
        String opt3 = "1789";
        String opt4 = "1563";
        String opt5 = "9876";
        String opt6 = "4561";
        String opt7 = "7243";
        String opt8 = "2314";

        printResult(opt1, target);
        printResult(opt2, target);
        printResult(opt3, target);
        printResult(opt4, target);
        printResult(opt5, target);
        printResult(opt6, target);
        printResult(opt7, target);
        printResult(opt8, target);
    }


    private static String generateTask() {
        Random random = new Random();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> set = new ArrayList<>(Arrays.asList(array));

        Integer digit;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            if (i == 1) {
                set.add(0);
            }
            int d = random.nextInt(set.size());
            digit = set.remove(d);
            sb.append(digit);
        }

        return sb.toString();
    }

    private static int countBulls(String option, String target) {
        if (option.length() != target.length())
            return 0;
        int sum = 0;
        for (int i = 0; i < option.length(); i++) {
            if (option.charAt(i) == target.charAt(i))
                sum++;
        }

        return sum;
    }

    private static int countCowsEn(String option, String target) {
        if (option.length() != target.length())
            return 0;
        int sum = 0;
        for (int i = 0; i < option.length(); i++) {
            for (int j = 0; j < target.length(); j++) {
                if (option.charAt(i) == target.charAt(j) && (i != j)) {
                    sum++;
                    break;
                }
            }
        }
        return sum;
    }

    private static int countCowsUk(String option, String target) {
        if (option.length() != target.length())
            return 0;
        int sum = 0;
        for (int i = 0; i < option.length(); i++) {
            for (int j = 0; j < target.length(); j++) {
                if (option.charAt(i) == target.charAt(j)) {
                    sum++;
                    break;
                }
            }

        }

        return sum;
    }


    private static void printResult(String option, String target) {
        System.out.println("Option " + option + ", for result " + target +
                ", bulls: " + countBulls(option, target) +
                ", cowsEn: " + countCowsEn(option, target) +
                ", cowsUk: " + countCowsUk(option, target));
    }
}
