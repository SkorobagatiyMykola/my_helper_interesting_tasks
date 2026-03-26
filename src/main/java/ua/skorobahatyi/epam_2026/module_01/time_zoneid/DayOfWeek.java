package ua.skorobahatyi.epam_2026.module_01.time_zoneid;

import java.time.LocalDate;
import java.time.LocalTime;

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("===========================");

        LocalDate localDate = LocalDate.now();


        System.out.println(localDate.getDayOfWeek());

        LocalDate localDate2 = LocalDate.parse("2020-10-04");
        System.out.println(localDate2 + " :"+localDate2.getDayOfWeek());

        LocalDate localDate3 = LocalDate.parse("2020-10-10");
        System.out.println(localDate3 + " :"+localDate3.getDayOfWeek());


        LocalTime l1 = LocalTime.of(23,59,59);

        System.out.println(l1);


    }
}
