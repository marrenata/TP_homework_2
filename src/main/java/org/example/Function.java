package org.example;

import java.io.*;
import java.util.*;

class Function {

    public static void main(String[] args) {
        File file = new File("numbers.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersAsString = line.split(" ");
            int[] numbers = new int[numbersAsString.length];
            for (int i = 0; i < numbersAsString.length; i++) {
                numbers[i] = Integer.parseInt(numbersAsString[i]);
            }
            scanner.close();

            int min = _min(numbers);
            int max = _max(numbers);
            int sum = _sum(numbers);
            long mult = _mult(numbers);

            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
            System.out.println("Sum of all numbers: " + sum);
            System.out.println("Product of all numbers: " + mult);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    public static int _min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int _max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int _sum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static long _mult(int[] numbers) {
        long mult = 1;
        for (int num : numbers) {
            mult *= num;
        }
        return mult;
    }
}