package ua.skorobahatyi.help_for_rest;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetCurrency {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        //HttpClient client =HttpClient.newHttpClient();
        String url= "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=usd&json";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                //.uri(new URI("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json"))
                .GET()
                .build();
        System.out.println(url);

        HttpResponse response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
