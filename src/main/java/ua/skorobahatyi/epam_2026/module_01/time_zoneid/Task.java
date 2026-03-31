package ua.skorobahatyi.epam_2026.module_01.time_zoneid;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {
        // Use the official IANA ID
        ZoneId yukonZone = ZoneId.of("Canada/Yukon");
        ZonedDateTime now = ZonedDateTime.now(yukonZone);

        System.out.println("Current Yukon Time: " + now.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        System.out.println("Current Offset: " + now.getOffset());
    }
}
