package ru.job4j.condition;

public class Max {
    public static int summation(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Max.summation(1, 2));
    }
}
