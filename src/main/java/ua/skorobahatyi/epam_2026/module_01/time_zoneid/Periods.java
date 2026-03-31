package ua.skorobahatyi.epam_2026.module_01.time_zoneid;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Periods {
    public static void main(String[] args) {
        System.out.println("====== Periods ==========");

        Period p1 = Period.of(1,1,1);
        System.out.println(p1);

        Period p2 = Period.ofDays(100);
        System.out.println(p2);

        LocalDate l1 = LocalDate.of(2022,1,1);
        LocalDate l2 = LocalDate.now();

        Period p3 = Period.between(l1,l2);
        System.out.println(p3);
        System.out.println(p3.getDays()); //  todo (???)


        long daysBetween = ChronoUnit.DAYS.between(l1,l2);
        System.out.println(daysBetween);

    }
}
