package ua.skorobahatyi.tasks_from_netpeak_talent;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=======  Testing ============");
        TransactionStatus[] status = TransactionStatus.values();
        TransactionStatus2[] status2 = TransactionStatus2.values();

        Arrays.stream(status).forEach(el-> System.out.println(el+": "+el.isFinal()));
        Arrays.stream(status).forEach(el-> System.out.println(el+": "+el.isFinal2()));
        System.out.println("======================");
        Arrays.stream(status2).forEach(el-> System.out.println(el+": "+el.isFinal2()));

        BigDecimal dig = new BigDecimal(15);
        BigDecimal dig2 = new BigDecimal(175);

        System.out.println(dig+"  --  : "+ dig.negate());

        //System.out.println(dig);

        //System.out.println(status.isFinal());
    }
}
