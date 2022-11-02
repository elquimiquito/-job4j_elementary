package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 7 / 6;
        return rsl;
    }

     public static float dollarToEuro(float value) {
        float rsl = value  * 6 / 7;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");
        float ruble = Converter.dollarToRuble(5);
        System.out.println("5 dollars are " + ruble + " ruble.");
        ruble = Converter.euroToRuble(4);
        System.out.println("4 euros are " + ruble + " ruble");
        dollar = Converter.euroToDollar(10);
        System.out.println("10 euros are " + dollar + " dollar");
        euro = Converter.dollarToEuro(15);
        System.out.println("15 dollars are " + euro + " euro");
    }
}