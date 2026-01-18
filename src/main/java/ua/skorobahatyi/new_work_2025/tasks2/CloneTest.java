package ua.skorobahatyi.new_work_2025.tasks2;

import java.util.LinkedHashMap;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1= new User("Nick",45);
        User user2 = (User) user1.clone();
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
    }
}
