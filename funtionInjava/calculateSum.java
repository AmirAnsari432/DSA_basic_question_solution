package funtionInjava;

import java.util.Scanner;

public class calculateSum {
    public static int CalculateSum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = CalculateSum(a, b);
            System.out.println(sum);
        }
    }
}