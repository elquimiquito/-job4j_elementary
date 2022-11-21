package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        if (right == left) {
            return left;
        } else {
            int result = left > right ? left : right;
            return result;
        }
    }
}