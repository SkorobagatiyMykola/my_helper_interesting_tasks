package ua.skorobahatyi.elasticsearch.tests;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    private int age;

    private List<Pet> pets;
}
