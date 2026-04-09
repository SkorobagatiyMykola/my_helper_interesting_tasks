package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.optional_ex;

import java.util.HashMap;
import java.util.Map;

public class Price {
    private Map<String, Double> rates;
    private Double value;


    public Price(Double value) {
        this.value = value;
        rates = new HashMap<>();
        rates.put("USD", 1d);
        rates.put("GBD", 0.6);
        rates.put("EUR", 0.8);
    }

    public Double convert(String toCurrency) {
        if (toCurrency.equals("USD")) {
            //return value;
            return Double.valueOf(value);
        } else {
            Double conversion = rates.get("USD") / rates.get(toCurrency);
            Double result = conversion * value;
            return result;
            /*value = conversion * value;
            return value;*/
        }
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
