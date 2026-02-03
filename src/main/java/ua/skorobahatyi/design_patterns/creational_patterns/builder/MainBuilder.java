package ua.skorobahatyi.design_patterns.creational_patterns.builder;

public class MainBuilder {
    public static void main(String[] args) {


        UserBuilder user1= UserBuilder.newBuilder()
                .setName("Nick")
                .setSurname("Skoronahatiy")
                .build();

        System.out.println(user1);

        UserBuilder user2= UserBuilder.newBuilder()
                .setName("Nick")
                .setSurname("Skoronahatiy")
                .setAge(43)
                .setBirthday("18/05/1980")
                .setHobbies("chess, soccer")
                .build();

        System.out.println(user2);
    }




}
