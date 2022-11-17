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
        float conversionCoefficient = 1.16F;
        float rsl = value * conversionCoefficient;
        return rsl;
    }

     public static float dollarToEuro(float value) {
        float conersionCoefficient = 0.85F;
        float rsl = value  * conersionCoefficient;
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
        dollar = Converter.euroToDollar(1);
        System.out.println("1 euro are " + dollar + " dollar");
        euro = Converter.dollarToEuro(1);
        System.out.println("1 dollars are " + euro + " euro");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
        in = 2;
        expected = 140;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("2 euros are 140. Test result : " + passed);
        in = 2;
        expected = 120;
        out = Converter.rubleToEuro(in);
        passed = expected == out;
        System.out.println("2 dollars are 120. Test result : " + passed);
        in = 1;
        expected = 1.16F;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("1 dollars are 0.85. Test result : " + passed);
        in = 1;
        expected = 0.85F;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("1 euros are 0.85. Test result : " + passed);

    }
}