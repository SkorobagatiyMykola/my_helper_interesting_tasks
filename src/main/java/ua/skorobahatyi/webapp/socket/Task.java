package ua.skorobahatyi.webapp.socket;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

// https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=10&api_key=DEMO_KEY
// Знайти фото з найбільшим розміром
public class Task {
    private static String URL= "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=10&api_key=DEMO_KEY";
    public static void main(String[] args) {

    }

    @Data
    @JsonIgnoreProperties
    static class Response {
        private String img_src;
    }
}
