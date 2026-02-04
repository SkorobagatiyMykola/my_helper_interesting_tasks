package ua.skorobahatyi.help_for_collections;

public class HashCodeForString {
    private static final String allSymbols = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}";

    public static void main(String[] args) {
        //iterateAll_1_Digit_Values();
        //iterateAll_2_Digit_Values();
        iterateAll_3_Digit_Values();
        iterateAll_4_Digit_Values();
       // iterateAll_5_Digit_Values();
        /*iterateAll_6_Digit_Values();*/
        System.out.println("   ".hashCode());
        System.out.println(Integer.MAX_VALUE);
    }

    private static void printAllSymbolsFromANSI() {
        for (int i = 33; i < 126; i++) {
            System.out.print(Character.toString(i));
        }
    }

    private static void iterateAll_1_Digit_Values() {
        for (int i = 0; i < allSymbols.length(); i++) {
            String check = ""+allSymbols.charAt(i);
            if (check.hashCode() == 0)
                System.out.println(check);
        }
    }

    private static void iterateAll_2_Digit_Values() {
        for (int i = 0; i < allSymbols.length(); i++) {
            for (int j = 0; j < allSymbols.length(); j++) {
                String check = ""+allSymbols.charAt(i) + allSymbols.charAt(j);
                if (check.hashCode() == 0) {
                    System.out.println(check);
                }
                System.out.println(check+" - "+check.hashCode());
            }
        }
    }

    private static void iterateAll_3_Digit_Values() {
        for (int i = 0; i < allSymbols.length(); i++) {
            for (int j = 0; j < allSymbols.length(); j++) {
                for (int k = 0; k < allSymbols.length(); k++) {
                    String check = ""+allSymbols.charAt(i) +
                            allSymbols.charAt(j) + allSymbols.charAt(k);
                    if (check.hashCode() == 0)
                        System.out.println(check);
                }
            }
        }
    }

    private static void iterateAll_4_Digit_Values() {
        for (int i = 0; i < allSymbols.length(); i++) {
            for (int j = 0; j < allSymbols.length(); j++) {
                for (int k = 0; k < allSymbols.length(); k++) {
                    for (int l = 0; l < allSymbols.length(); l++) {
                        String check = ""+allSymbols.charAt(i) +
                                allSymbols.charAt(j) + allSymbols.charAt(k) + allSymbols.charAt(l);
                        if (check.hashCode() == 0)
                            System.out.println(check);
                        System.out.println(check+" - "+check.hashCode());
                    }

                }
            }
        }
    }

    private static void iterateAll_5_Digit_Values() {
        for (int i = 0; i < allSymbols.length(); i++) {
            for (int j = 0; j < allSymbols.length(); j++) {
                for (int k = 0; k < allSymbols.length(); k++) {
                    for (int l = 0; l < allSymbols.length(); l++) {
                        for (int m = 0; m < allSymbols.length(); m++) {
                            String check = ""+allSymbols.charAt(i) +
                                    allSymbols.charAt(j) + allSymbols.charAt(k) +
                                    allSymbols.charAt(l) + allSymbols.charAt(m);
                            if (check.hashCode() == 0)
                                System.out.println(check);
                        }
                    }
                }
            }
        }
    }

    private static void iterateAll_6_Digit_Values() {
        for (int i = 0; i < allSymbols.length(); i++) {
            for (int j = 0; j < allSymbols.length(); j++) {
                for (int k = 0; k < allSymbols.length(); k++) {
                    for (int l = 0; l < allSymbols.length(); l++) {
                        for (int m = 0; m < allSymbols.length(); m++) {
                            for (int n = 0; n < allSymbols.length(); n++) {
                                String check = ""+allSymbols.charAt(i) +
                                        allSymbols.charAt(j) + allSymbols.charAt(k) +
                                        allSymbols.charAt(l) + allSymbols.charAt(m) + allSymbols.charAt(n);
                                if (check.hashCode() == 0)
                                    System.out.println(check);
                            }
                        }
                    }
                }
            }
        }
    }

}
