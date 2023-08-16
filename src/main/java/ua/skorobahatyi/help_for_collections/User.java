package ua.skorobahatyi.help_for_collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String email;

    static class GenerationUsers{
        static List<User> generationUsers(){
            int id=0;
            List<User> userList = new ArrayList<>();
            userList.add(new User(++id,"Nick","Skoronahatyi",42,"nikolays2001@ukr.net"));
            userList.add(new User(++id,"Olga","Skoronahata",40,"olga@ukr.net"));
            userList.add(new User(++id,"Tanya","Petrova",12,"tanya@ukr.net"));
            userList.add(new User(++id,"Pavlo","Skoronahatyi",9,"pavlo@ukr.net"));
            userList.add(new User(++id,"Ivan","Ivanov",72,"ivan@ukr.net"));
            userList.add(new User(++id,"Petro","Petrov",74,"petro@ukr.net"));
            userList.add(new User(++id,"Mykola","Shevchenko",42,"mykola@ukr.net"));
            userList.add(new User(++id,"Galina","Skoronahata",67,"galina@ukr.net"));
            userList.add(new User(++id,"Olga","Gesak",38,"olgaGusak@ukr.net"));
            userList.add(new User(++id,"Java","Gesak",38,"olgaGusak@ukr.net"));

            return userList;
        }
    }
}


