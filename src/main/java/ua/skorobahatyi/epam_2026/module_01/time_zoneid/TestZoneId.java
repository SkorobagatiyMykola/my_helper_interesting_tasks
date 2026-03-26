package ua.skorobahatyi.epam_2026.module_01.time_zoneid;

import java.time.*;
import java.time.format.TextStyle;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class TestZoneId {
    public static void main(String[] args) {
        System.out.println("Test ZoneId");

        int i = 1;

        Set<String> setZoneId = new TreeSet<>();
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            //System.out.println(i+++" - "+zoneId);
            ZoneId zoneId1 = ZoneId.of(zoneId);
            String zoneIdDisplayName = zoneId1.getDisplayName(TextStyle.FULL, Locale.US);

            System.out.println(i++ + " - " + zoneId + " : " + zoneIdDisplayName);
            setZoneId.add(zoneIdDisplayName);

        }


        System.out.println("Count of zoneId: " + setZoneId.size());
        System.out.println("============");
        // Count of zoneId: 195
        // At 19:29 on 25/03/2026 I obtained 603 items
        ZoneId zoneId = ZoneId.of("US/Pacific");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zdt1 = ZonedDateTime.of(localDateTime,zoneId);
        System.out.println(zdt1);
        System.out.println("============");


        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.getZone()); // Europe/Kiev
        // 2026-03-25T19:39:46.195700400+02:00[Europe/Kiev]


        System.out.println(Instant.now());

        Clock clock = Clock.systemUTC();

        System.out.println(clock);
        System.out.println(clock.getZone());
        System.out.println(clock.instant());
    }
}
