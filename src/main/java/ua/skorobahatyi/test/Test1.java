package ua.skorobahatyi.test;

public class Test1 {
    public static void main(String[] args) {

        String[] arr1 = {"P@sswORD1","20passWORD20","PASS6word"};
        String check1="4dro6";

        String[] arr2 = {"theBestpassword","myPassword#3"};
        String check2="1dro0";

        String[] arr3 = {"MyPassword2","crazyPassword1#$%"};
        String check3="1%$#1";

        String[] arr4 = {"luckyPASSWORD#$$$","luckyDay666"};
        String check4="6pass7";

        password(arr1,check1);
        password(arr2,check2);
        password(arr3,check3);
        password(arr4,check4);
    }

    public static String password( String[] passwords, String checkString ) {
        // Convert check-String for check conditions
        int countUpperSymbols = Integer.valueOf(checkString.substring(0,1));
        String endSymbols = new StringBuilder(checkString.substring(1,4)).reverse().toString();
        int sumDigits = Integer.valueOf(checkString.substring(checkString.length()-1));

        for (String pass:passwords) {
            // Main check
            if (!pass.endsWith(endSymbols))
                continue;
            int countUpperFromPass=0;
            int sum=0;
            for (int i = 0; i < pass.length(); i++) {
                // ANSI code (Upper character) from A to X => from 65 to 90
                if (pass.charAt(i)>=65 &&pass.charAt(i)<=90) {
                    countUpperFromPass++;
                }
                // ANSI code Digits from 0 to 9 => from 48 to 57
                if (pass.charAt(i)>=48 &&pass.charAt(i)<=57) {
                    int digit=Integer.valueOf(pass.charAt(i)-48);
                    sum+=digit;
                }
                if (countUpperSymbols==countUpperFromPass && sumDigits==sum){
                    System.out.println(pass);
                    return pass;
                }

            }

        }

        return "ERROR, I can't find PASSWORD";
    }
}
