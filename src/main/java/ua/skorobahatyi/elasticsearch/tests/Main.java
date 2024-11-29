package ua.skorobahatyi.elasticsearch.tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Pet pet1= new Pet("Tuzik",2);
        Pet pet2= new Pet("Snigok",2);


        User user1 = new User("Nick", "Skorobagatiy",10,null);
        User user2 = new User("Olga", "Skorobagata",10, List.of(pet1,pet2));
        User user3 = new User("Tetiana", "Skorobagata",13, List.of(pet1,pet2));
        User user4 = new User("Pavlo", "Skorobagatiy",9, List.of(pet2));

        System.out.println(user1);
        System.out.println(user2);

        ObjectMapper mapper = new ObjectMapper();

        String json =mapper.writeValueAsString(user1);
        String json2 =mapper.writeValueAsString(user2);
        String json3 =mapper.writeValueAsString(user3);
        String json4 =mapper.writeValueAsString(user4);

        System.out.println(json);
        System.out.println(json2);
        System.out.println(json3);
        System.out.println(json4);


    }
}
