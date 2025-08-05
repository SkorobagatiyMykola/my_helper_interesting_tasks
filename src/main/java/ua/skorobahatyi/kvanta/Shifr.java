package ua.skorobahatyi.kvanta;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Shifr {
    private static String[] alphabetArr = {};
    private static String alphabet = "а,б,в,г,ґ,д,е,є,ж,з,и,і,ї,й,к,л,м,н,о,п,р,с,т,у,ф,х,ц,ч,ш,щ,ь,ю,я";
    //private static String key = "кіт";
    //private static String encode = "мгзоьна дбб зсхинвац всируґ";

    private static String key = "ключ";
    private static String encode = "мгзоьна дбб зсхинвац всируґ";
    private static String word = "поліалфавітний шифр";

    public static void main(String[] args) {
        System.out.println("Шифр");
        Locale locale = new Locale("uk", "UA");
        locale.getLanguage();


        System.out.println(encode);
        System.out.println(alphabet);
        String[] arr = alphabet.split(",");
        Map<String, Integer> mapKeyStr = new HashMap<>();
        Map<Integer, String> mapKeyNum = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mapKeyStr.put(arr[i], i);
            mapKeyNum.put(i, arr[i]);
        }

        System.out.println(arr.length);
        /*for (int i = 0; i < encode.length(); i++) {
            String el= encode.substring(i,i+1);
            //System.out.print(el);
            System.out.println(el +" - "+mapKeyStr.get(el));
        }*/

        int lengthKey = key.length();
        //System.out.println(word.replaceAll(" ",""7));
        int lengthWord = word.replaceAll(" ", "").length();
        int repeater = lengthWord / lengthKey + 1;

        String wordNew = word.replaceAll(" ", "");
        String keyNey = "";
        for (int i = 0; i < repeater; i++) {
            keyNey += key;
        }
        System.out.println(keyNey + " - " + keyNey.length());
        System.out.println(wordNew + " - " + wordNew.length());

        String encodeNew = "";
        for (int i = 0; i < wordNew.length(); i++) {
            String el = wordNew.substring(i, i + 1);
            String elKey = keyNey.substring(i, i + 1);

            //System.out.println( " -- sym: key, word: "+ elKey+", "+ el);

            int id = (mapKeyStr.get(el) + mapKeyStr.get(elKey)) % 33;
            System.out.println(id + " -- sym: key, word: " + elKey + ", " + el);
            encodeNew += mapKeyNum.get(id);
        }

        System.out.println("!!" + mapKeyNum.size());

        //аайд/кьтч/мцрі/фш цґ/дв

        System.out.println(encodeNew);

        String check = "аайдкьтчмцріфш цґдв";


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
