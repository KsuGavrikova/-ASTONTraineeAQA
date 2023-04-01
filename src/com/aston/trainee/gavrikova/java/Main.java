package com.aston.trainee.gavrikova.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int standardNum = 7;
            matchesNumber(in, standardNum);

            String standardName = "Вячеслав";
            matchesName(in, standardName);

            int[] array = createArray(in);
            arrayPocessing(array);
        }

    }

    private static int[] createArray(Scanner in) {
        System.out.println("Введите длину массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    private static void matchesNumber(Scanner in, int standardNum) {
        System.out.print("Введите число: ");
        double num = in.nextDouble();
        if (num > standardNum) {
            System.out.println("Привет");
        }
    }

    private static void matchesName(Scanner in, String standardName) {
        System.out.print("Введите имя: ");
        String name = in.next();
        String standard = name.equals(standardName) ? "Привет, " + standardName : "Нет такого имени";
        System.out.println(standard);
    }

    private static void arrayPocessing(int[] mass) {
        System.out.println("Элементы массива кратнвые 3: ");
        Arrays.stream(mass).filter(s -> 0 == s % 3).forEach(s -> System.out.println(s));
    }
}
