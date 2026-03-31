package ua.skorobahatyi.epam_2026.module_01.time_zoneid;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Durations {
    public static void main(String[] args) {
        System.out.println("============== Duration  ==============");

        Duration d1 = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(d1);

        Duration d2 = Duration.ofHours(5);
        System.out.println(d2);

        Duration d3 = Duration.ofSeconds(10000);
        System.out.println(d3);

        Duration d4 = Duration.parse("PT1H");

        System.out.println(d4);
    }

}
