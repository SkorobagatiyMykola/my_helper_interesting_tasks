package ua.skorobahatyi.epam_2026.module_01.time_zoneid;

import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        System.out.println(LocalDate.of(2023, 02, 10).plusDays(1));

        System.out.println(LocalDate.parse("2023-02-10").getMonthValue());
    }
}
