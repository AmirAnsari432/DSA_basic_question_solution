package funtionInjava;

import java.util.*;

public class averageOfNumbers {

    public static int averageOfThreeNumber(int a, int b, int c) {
        int sum = a + b + c;
        int average = sum / 3;
        return average;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int average = averageOfThreeNumber(a, b, c);
            System.out.println(average);
        }
    }
}
