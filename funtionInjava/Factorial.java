package funtionInjava;

import java.util.Scanner;

public class Factorial {

    public static void factorialNumber(int n) {

        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }

        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            factorialNumber(n);
        }

    }
}
