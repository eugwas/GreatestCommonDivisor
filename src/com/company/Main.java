package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int first = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int second = scanner.nextInt();
            GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor(first, second);
            System.out.println("Greatest common divisor = " + greatestCommonDivisor.getGreatestCommonDivisor(first, second));
        } else {
            System.out.println("Invalid number");
        }
        scanner.nextLine();
        scanner.close();
    }
}
