package ua.skorobahatyi.help_for_rest.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CurrencyJSON {
    // cc
    @JsonProperty("cc")
    private String currency;

    @JsonProperty("rate")
    private double rate;
}
