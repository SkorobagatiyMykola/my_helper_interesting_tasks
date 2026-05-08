package ua.skorobahatyi.epam_2026.module_03.interface1;

import java.time.LocalDate;

public class Inter1 {
    public static void main(String[] args) {

        String position = "MANAGER";
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);


            /*for (Position s : Position.values()) {
                if (s.name().equalsIgnoreCase(position)) {
                    return s;
                }
            }*/
        //return null; // or throw a custom exception
    }
}

