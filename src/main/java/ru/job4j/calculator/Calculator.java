package ru.job4j.calculator;

public class Calculator {

    public static void plus(int first, int second) {
        System.out.println(first + second);
    }

    public static void minus(int first, int second) {
        System.out.println(first - second);
    }
    public static void main(String[] args) {
       plus(5,2);
       minus(10,1);
    }
}
