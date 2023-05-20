package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divAndSub(double first, double second) {
        return division(first, second)
                + subtraction(first, second);
    }

    public static double subAndMulti(double first, double second) {
        return subtraction(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + divAndSub(20, 2));
        System.out.println("Результат расчета равен: " + subAndMulti(44, 21));
    }
}
