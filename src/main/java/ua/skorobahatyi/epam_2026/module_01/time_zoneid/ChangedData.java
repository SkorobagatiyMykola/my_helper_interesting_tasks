package ua.skorobahatyi.epam_2026.module_01.time_zoneid;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ChangedData {
    public static void main(String[] args) {
        System.out.println("====================");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.plusMonths(9));
        System.out.println(localDate.withMonth(9));

        System.out.println(localDate.plusMonths(15));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DDD", Locale.US);
        System.out.println(formatter.format(LocalDateTime.now()));

        FormatStyle d;


        DateTimeFormatter parser = new DateTimeFormatterBuilder()
                .appendPattern("yyyyMMdd")
                .toFormatter();
        System.out.println(parser.parse("20230115", LocalDate::from));
    }
}
