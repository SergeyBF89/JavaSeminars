package org.Seminar6.classTask4.model;

public class Fahrenheit implements Converter{
    @Override
    public Double convert(Double inputValue) {
        return inputValue * 9/5 + 32;
    }
}
