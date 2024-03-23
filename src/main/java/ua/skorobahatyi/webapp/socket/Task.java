package ua.skorobahatyi.webapp.socket;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

// https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=10&api_key=DEMO_KEY
// Знайти фото з найбільшим розміром
public class Task {
    private static String URL = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=10&api_key=DEMO_KEY";
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = null;
            try {
                request = HttpRequest.newBuilder()
                        .uri(new URI(URL))
                        .GET()
                        .build();
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }

            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());



            String res = response.body().toString();
            Photos photos = objectMapper.readValue(res, Photos.class);
            System.out.println(photos.getPhotos().size());

            for (Photo photo : photos.getPhotos()) {
                String url = photo.getImg_src();

                request = HttpRequest.newBuilder()
                        .uri(new URI(url))
                        .GET()
                        .build();
                HttpResponse responseNew = client.send(request, HttpResponse.BodyHandlers.ofString());

                //Optional<String> h=responseNew.headers().firstValue("Content-Length");
                HttpHeaders headers = responseNew.headers();
                OptionalLong h=responseNew.headers().firstValueAsLong("Content-Length");

                System.out.println(h.getAsLong());


            }


            System.out.println("===========================================================");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Opps..");
        }

    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Photo {
        @JsonProperty("id")
        private Integer id;
        @JsonProperty("img_src")
        private String img_src;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Photos {
        @JsonProperty("photos")
        private List<Photo> photos;
    }
}
