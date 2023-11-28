package ua.skorobahatyi.tasks_from_linked.http_response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import ua.skorobahatyi.help_for_rest.model.CurrencyJSON;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

/**
 * https://jsonmock.hackerrank.com/api/medical_records
 * https://www.transtutors.com/questions/rest-api-fit-count-use-the-http-get-method-to-retrieve-information-from-a--9588591.htm
 * https://gist.github.com/vipul-zambare006/d8aa23e212da2db2625d08aa9bdba588
 * https://medium.com/@sunshine990316/mckinsey-data-engineer-oa-prepare-595db6d397db
 * <p>
 * <p>
 * https://www.hackerrank.com/apply
 */
public class Used_Jackson {
    private static String URL = "https://jsonmock.hackerrank.com/api/medical_records";

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        getAverageWeight(2, 122);

    }

    private static void getAverageWeight(int doctorId, int breathingRate) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(URL))
                .GET()
                .build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String res = response.body().toString();
        //System.out.println(res);
        ObjectMapper mapper = new ObjectMapper(); // todo help us to convert JSON (!!!)

        MockResponse mockResponse = mapper.readValue(res, MockResponse.class);

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

        System.out.println("========  THE END ===============");
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class MockResponse {
        @JsonProperty("total_pages")
        private int total_pages;

        @JsonProperty("data")
        private List<MedicalRecord> medicalRecords;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class MedicalRecord {
        @JsonProperty("id")
        private int id;
        @JsonProperty("timestamp")
        private long timestamp;

        @JsonProperty("diagnosis")
        private Diagnosis diagnosis;
        @JsonProperty("vitals")
        private Vitals vitals;
        @JsonProperty("doctor")
        private Doctor doctor;

        @JsonProperty("meta")
        private Meta meta;

    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class Diagnosis {
        @JsonProperty("severity")
        private int severity;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class Vitals {
        @JsonProperty("breathingRate")
        private int breathingRate;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class Doctor {
        @JsonProperty("id")
        private int id;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class Meta {
        @JsonProperty("height")
        private int height;
        @JsonProperty("weight")
        private int weight;
    }
}
