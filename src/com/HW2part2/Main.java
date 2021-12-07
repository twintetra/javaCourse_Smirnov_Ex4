package com.HW2part2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] ss = {{1,2},{2,3}};
        System.out.println(Arrays.deepToString(ss));
        // С клавиатуры вводится двумерный массив, длина его строк – 4, столбцов – 3.
        int rows = 4;
        int columns = 3;
        Scanner inArr = new Scanner(System.in);
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            System.out.println("Введите элементы " + (i + 1) + "й строки массива: ");
            for (int j = 0; j < columns; j++) {
                int num = inArr.nextInt();
                arr[i][j] = num;
            }
            System.out.println();
        }
        // 1.Напишите программу, которая выводит номера строк и суммы их элементов (пример: Line 2: 17).
        for (int i = 0; i < rows; i++) {
            int sumLine = 0;
            for (int j = 0; j < columns; j++) {
               sumLine = sumLine + arr[i][j];
            }
            System.out.println("Line " + i + ": " + sumLine);
        }
        // 2.Напишите программу, которая выводит номера столбцов и суммы их элементов (пример: Column 3: 21).
        for (int i = 0; i < columns; i++) {
            int sumColumn = 0;
            for (int j = 0; j < rows; j++) {
                sumColumn = sumColumn + arr[j][i];
            }
            System.out.println("Column " + i + ": " + sumColumn);
        }
        // 3.Напишите программу, которая заменяет все нечётные элементы массива на 1, а чётные на 0 и выводит его на экран.
        int[][] arr3 = new int[rows][columns]; // создаю новый массив, чтоб не ломало следующие задания
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] % 2 == 0) {
                    arr3[i][j] = 0;
                } else {
                    arr3[i][j] = 1;
                }
            }
        }
        System.out.println("3: " + Arrays.deepToString(arr3));
        // 4.Напишите программу, которая для в каждой строке находит целое среднее арифметическое и выводит его на экран.
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < columns; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Average of line " + i + ": " + sum / columns);
        }
        // 5.***Напишите программу, которая преобразует двумерный массив в перевёрнутый одномерны и выводит все элементы одномерного массива на экран.
        int[] arr5 = new int[rows * columns];
        int index = 0;
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = columns - 1; j >= 0; j--) {
                arr5[index] = arr[i][j];
                index++;
            }
        }
        System.out.println("5: " + Arrays.toString(arr5));
    }
}
