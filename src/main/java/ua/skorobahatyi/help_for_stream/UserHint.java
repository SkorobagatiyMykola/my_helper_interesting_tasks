package ua.skorobahatyi.help_for_stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
public class UserHint {
    private int id;
    private String name;
    private String surname;

    private List<String> hobbies;

    static class GenerationUserHints{
        static List<UserHint> generationUsers(){
            int id=0;
            List<UserHint> userHintList = new ArrayList<>();

            List<String> hobby1 = List.of("football","basketball","tennis");
            List<String> hobby2 = List.of("football1","basketball1","tennis1");
            List<String> hobby3 = List.of("football2","basketball2");

            userHintList.add(new UserHint(1,"Nick","Skorobahatiy",hobby1));
            userHintList.add(new UserHint(2,"Ivan","Ivanov",hobby2));
            userHintList.add(new UserHint(3,"Petrov","Petrov",hobby3));




            return userHintList;
        }
    }

    // flatMap возвращает какой-то стрим (и все такие стримы склеиваются в один).
    public static void main(String[] args) {
        List<UserHint> users = GenerationUserHints.generationUsers();

        int x= (int) users.stream().map(el -> el.hobbies).count();
        int x2= (int) users.stream().map(el -> el.getHobbies()).flatMap(el->el.stream()).count();

        users.stream().map(el -> el.getHobbies()).flatMap(el->el.stream()).forEach(System.out::println);
        System.out.println(x);
        System.out.println(x2);

    }

}
