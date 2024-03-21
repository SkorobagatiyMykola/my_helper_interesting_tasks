package ua.skorobahatyi.webapp.socket;

import lombok.Data;

public class CustomJackson {
    public static void main(String[] args) {
        var json = "{\n" +
                "  \"firstName\": \"Mykola\",\n" +
                "  \"lastName\": \"Skorobahatyi\",\n" +
                "  \"email\": \"nikolays2001@ukr.net\"\n" +
                "}";

        var user = jsonToObjMy(json, User.class);
        System.out.println(user);

    }

    private static <T> T jsonToObjMy(String json, Class<T> userClass){
        var fields = userClass.getDeclaredFields();
        return null;
    }

    @Data
    static class User {
        private String firstName;
        private String lastName;
        private String email;

    }
}
