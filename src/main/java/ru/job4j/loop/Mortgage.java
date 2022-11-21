package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        while (amount * (1 + percent) > salary) {
            amount += amount * percent - salary;
            year += 1;
        }
        return year;
    }
}