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

    public static void main(String[] args) {
        float inRuble1 = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inRuble1);
        boolean passed1 = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        float inRuble2 = 600;
        float expectedDollar = 10;
        float outDollar = Converter.rubleToDollar(inRuble2);
        boolean passed2 = expectedDollar == outDollar;
        System.out.println("140 rubles are 2. Test result : " + passed2);
    }
}
