package ua.skorobahatyi.tasks_from_linked.http_response;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Used_Gson {
    private static String URL = "https://jsonmock.hackerrank.com/api/medical_records";
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
       getAverageWeight(4,125);
    }

    private static void getAverageWeight(int doctorId, int breathingRate) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(URL))
                .GET()
                .build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String jsonString = response.body().toString();


        Gson g = new Gson();
        MockResponse mockResponse = g.fromJson(jsonString, MockResponse.class);

        List<MedicalRecord> medicalRecords = mockResponse.medicalRecords;

        int countRecords = (int) medicalRecords.stream()
                .filter(el -> el.doctor.id == doctorId)
                .filter(el -> el.vitals.breathingRate < breathingRate)
                .count();

        double heightAvg = medicalRecords.stream()
                .filter(el -> el.doctor.id == doctorId)
                .filter(el -> el.vitals.breathingRate < breathingRate)
                .mapToDouble(el -> el.meta.height)
                .average().orElse(0.0);

        double weightAvg = medicalRecords.stream()
                .filter(el -> el.doctor.id == doctorId)
                .filter(el -> el.vitals.breathingRate < breathingRate)
                .mapToDouble(el -> el.meta.weight)
                .average().orElse(0.0);

        System.out.println("Count medical records: " + countRecords);
        System.out.println("Average height: " + heightAvg);
        System.out.println("Average weight: " + weightAvg);

        System.out.println("=== THE END ===");

    }

    @Data
    private static class MockResponse {
       // @JsonProperty("total_pages")
        private int total_pages;

        @SerializedName("data")
        private List<MedicalRecord> medicalRecords;
    }

    @Data
    private static class MedicalRecord {
        //@JsonProperty("id")
        private int id;
       // @JsonProperty("timestamp")
        private long timestamp;

       // @JsonProperty("diagnosis")
        private Diagnosis diagnosis;
     //   @JsonProperty("vitals")
        private Vitals vitals;
        //@JsonProperty("doctor")
        private Doctor doctor;

        //@JsonProperty("meta")
        private Meta meta;

    }

    @Data
    private static class Diagnosis {
       // @JsonProperty("severity")
        private int severity;
    }

    @Data
    private static class Vitals {
        //@JsonProperty("breathingRate")
        private int breathingRate;
    }

    @Data
    private static class Doctor {
        //@JsonProperty("id")
        private int id;
    }

    @Data
    private static class Meta {
        //@JsonProperty("height")
        private int height;
        //@JsonProperty("weight")
        private int weight;
    }
}
