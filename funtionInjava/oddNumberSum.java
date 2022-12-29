package funtionInjava;

import java.util.Scanner;

public class oddNumberSum {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number ");
            int N, i, sum = 0;
            N = sc.nextInt();

            for (i = 0; i <= N; i++) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }
            System.out.print("Enter a number between 0 to " + N + " = " + sum);

        }

    }
}
