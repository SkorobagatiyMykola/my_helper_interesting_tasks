package ua.skorobahatyi.epam_2026.module_01.time_zoneid;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TewstTimeFormater {
    public static void main(String[] args) {
        System.out.println("========== Data Formatter =============");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM DD yyyy");

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(formatter.format(localDateTime));

        String str = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(localDateTime);
        System.out.println(str);

        String timeFormat = "######";
        LocalTime time = LocalTime.of(14, 30);
        System.out.println(time.format(DateTimeFormatter.ofPattern(timeFormat)));
    }
}
