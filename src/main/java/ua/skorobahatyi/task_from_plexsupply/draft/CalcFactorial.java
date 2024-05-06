package ua.skorobahatyi.task_from_plexsupply.draft;

import com.google.common.math.BigIntegerMath;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class CalcFactorial {

    private static String URL = "https://www.wolframalpha.com/input?i={value}%21";

    public static void main(String[] args) {
        //Document page = getPage(100);

        System.out.println(BigIntegerMath.factorial(9999));

        System.out.println("===============================");
        //System.out.println(Combina.factorial(9999));

        String line="";
        for (int i = 0; i <=20 ; i++) {
            //System.out.println(calcFact(i));
            line+=String.valueOf(calcFact(i))+", ";
        }

        System.out.println(line);

//        System.out.println(calcFact(4));
//        System.out.println(calcFact(1));
//        System.out.println(calcFact(2));
//        System.out.println(calcFact(1));
//        System.out.println(calcFact(19));
//        System.out.println(calcFact(20));
//        System.out.println(calcFact(21));

    }


    private static long calcFact(int value) {
        long result=1;
        for (int i = 2; i <=value ; i++) {
            result*=i;
        }

        return result;
    }

    private static Document getPage(int value) {
        Document page;
        try {
            String urlCalc = URL.replace("{value}", String.valueOf(value));
            page = Jsoup.connect(urlCalc).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return page;
    }
}
