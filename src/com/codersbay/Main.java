package com.codersbay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[0];

        while (!scanner.hasNext("q") && !scanner.hasNext("Q")) {
            int newNumber = scanner.nextInt();
            int[] biggerArray = new int[numbers.length + 1];

            for (int i = 0; i < numbers.length; i++) {
                biggerArray[i] = numbers[i];
            }
            biggerArray[numbers.length] = newNumber;
            numbers = biggerArray;
        }

        int biggestNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (biggestNumber < numbers[i]) {
                biggestNumber = numbers[i];
            }
        }

        System.out.println("you entered q or Q");
        System.out.println("maximum is  " + biggestNumber);

    }
}