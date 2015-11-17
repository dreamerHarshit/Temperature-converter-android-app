package com.example.dreamer.temperatureconverter;

/**
 * Created by dreamer on 29/10/15.
 */
public class UnitConverter {
    public static double celsius2fareheit(double f){
        return (f-32)*5/9;
    }
    public static double fareheit2celsius(double c){
        return 32+c*9/5;
    }
}
