package ua.skorobahatyi.helper_for_tests.it_quiz;

/**
 *
 * What will be the result of executing the following code?
 *
 *
 * The weather is rainy  (!!!)
 * The weather is sunny
 * The rainy days were on Monday and Friday
 * The rainy days were on Monday and Sunday (!!!)
 * The temperature is 20°C
 * The temperature is 35°C (!!!)
 *
 * */
public class Task9 {

    public static void changeTheString(String weather) {
        weather = "sunny";
    }

    public static void changeTheArray(String[] rainyDays) {
        rainyDays[1] = "Sunday";
    }

    public static void changeTheObject(Forecast forecast) {
        forecast.temperature = 35;
    }

    public static void main(String[] args) {
        String weather = "rainy";
        changeTheString(weather);
        System.out.println("The weather is " + weather);
        String[] rainyDays = new String[] {
                "Monday",
                "Friday"
        };
        changeTheArray(rainyDays);
        System.out.println("The rainy days were on " + rainyDays[0] + " and " + rainyDays[1]);
        Forecast forecast = new Forecast();
        forecast.pressure = 700;
        forecast.temperature = 20;
        changeTheObject(forecast);
        System.out.println("The temperature is " + forecast.temperature + "°C");
    }
}

class Forecast {
    public int temperature;
    public int pressure;
}