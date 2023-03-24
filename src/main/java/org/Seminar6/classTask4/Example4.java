package org.Seminar6.classTask4;

import org.Seminar6.classTask4.model.Celsius;
import org.Seminar6.classTask4.model.Fahrenheit;
import org.Seminar6.classTask4.model.Kelvin;

public class Example4 {
    public static void main(String[] args) {
        Double temperature = 10.0;
        Double temperatureFar = new Fahrenheit().convert(temperature);
        System.out.println(temperatureFar);
        Double temperatureKel = new Kelvin().convert(temperature);
        System.out.println(temperatureKel);
        Double temperatureCel = new Celsius().convert(temperature);
        System.out.println(temperatureCel);
    }
}
