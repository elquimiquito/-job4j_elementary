package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differAndDivide(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double bigSum(double first, double second) {
        return sumAndMultiply(first, second)
                + differAndDivide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differAndDivide(10, 20));
        System.out.println("Результат расчета равен: " + bigSum(10, 20));
    }
}