package com.company;

public class GreatestCommonDivisor {
    private int first;
    private int second;

    public GreatestCommonDivisor(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int minimum = Math.min(first, second);
        int count = 1;
        int divisor = 1;

        for (int i = divisor; i <= minimum; i++) {
            if (first % i == 0 && second % i == 0) {
                divisor = i;
                System.out.println("Divisor = " + divisor);
            }
        }

//        while (divisor <= minimum) {
//            if (first % divisor == 0 && second % divisor == 0) {
//                divisor++;
//            }
//        }

        return divisor;

    }
}
