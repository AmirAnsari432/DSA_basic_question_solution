package pactise;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            boolean isPrime = true;

            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (n == 1) {
                    System.out.println("this is niether prime not compsite");
                } else {
                    System.out.println("This is prime number");
                }

            } else {
                System.out.println("This is not prime number ");
            }
        }

    }
}
