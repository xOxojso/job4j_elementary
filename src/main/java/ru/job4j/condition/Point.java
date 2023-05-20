package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int subtractionX2X1 = x2 - x1;
        int subtractionY2Y1 = y2 - y1;
        double powX = Math.pow(subtractionX2X1, 2);
        double powY = Math.pow(subtractionY2Y1, 2);
        double add = powX + powY;
        double rsl = Math.sqrt(add);
        return rsl;
    }

    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 2;
        int x2 = 10;
        int y2 = 11;

        double result = distance(x1, y1, x2, y2);
        System.out.println(result);
    }
}
