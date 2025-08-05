package ua.skorobahatyi.kvanta;

import java.util.HashMap;
import java.util.Map;

public class MainShifr {

    private static String alphabet = "а,б,в,г,ґ,д,е,є,ж,з,и,і,ї,й,к,л,м,н,о,п,р,с,т,у,ф,х,ц,ч,ш,щ,ь,ю,я";
    //private static String key = "ключ";
    private static String key = "кот";
    //private static String encode = "аайдкьтчмцріфш цґдв";
    private static String encode = "мгзоьна дбб зсхинвац всируґ";
    // String check = "аайдкьтчмцріфш цґдв";
    public static void main(String[] args) {

        String[] arr = alphabet.split(",");
        Map<String, Integer> mapKeyStr = new HashMap<>();
        Map<Integer, String> mapKeyNum = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mapKeyStr.put(arr[i], i);
            mapKeyNum.put(i, arr[i]);
        }

        int lengthKey = key.length();
        String encodeNew = encode.replace(" ","");
        int lengthWord = encode.replaceAll(" ", "").length();
        int repeater = lengthWord / lengthKey + 1;

        String keyNey = "";
        for (int i = 0; i < repeater; i++) {
            keyNey += key;
        }


        System.out.println("=========================");
        String decodeNew = "";
        for (int i = 0; i < encodeNew.length(); i++) {
            String el = encodeNew.substring(i, i + 1);
            String elKey = keyNey.substring(i, i + 1);

            //System.out.println( " -- sym: key, word: "+ elKey+", "+ el);

            int diff = mapKeyStr.get(el) - mapKeyStr.get(elKey);
            int id = (diff > 0 ? diff : diff + 33) % 33;
            //System.out.println(id + " -- sym: key, word: " + elKey + ", " + el);
            decodeNew += mapKeyNum.get(id);
        }

        System.out.println(decodeNew);
    }
}
