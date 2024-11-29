package ua.skorobahatyi.elasticsearch.tests;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pet {
    private String name;
    private int age;
}
