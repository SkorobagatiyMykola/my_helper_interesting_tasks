package ua.skorobahatyi.epam_2026.module_01.time_zoneid;

import java.time.Clock;

public class ClockTest {
    public static void main(String[] args) {
        System.out.println("============ Clock =============");
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);
        System.out.println(clock.instant());

        System.out.println("--------------------");
        Clock clock1 = Clock.systemUTC();
        System.out.println(clock1.instant());


    }
}
