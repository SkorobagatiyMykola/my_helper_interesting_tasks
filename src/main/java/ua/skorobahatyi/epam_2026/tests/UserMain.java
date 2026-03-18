package ua.skorobahatyi.epam_2026.tests;

public class UserMain {
    public static void main(String[] args) {
        User user = new User("Nick",15);

        user.setAge(150);
        System.out.println(user);

        final User user1 = new User("Nick", 16);
        user1.setAge(25);
        System.out.println(user1);
    }
}
