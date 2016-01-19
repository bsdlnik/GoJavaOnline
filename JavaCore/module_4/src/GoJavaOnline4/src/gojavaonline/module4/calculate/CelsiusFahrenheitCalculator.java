package gojavaonline.module4.calculate;

public class CelsiusFahrenheitCalculator {

    public static float celsiusToFahrenheit(float degree){
        return (degree * 1.8f + 32);
    }

    public static float fahrenheitToCelsius(float degree){
        return ((degree-32)/1.8f);
    }
}
