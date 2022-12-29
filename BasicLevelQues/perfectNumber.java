package BasicLevelQues;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        int divSum, i, N;
        try (Scanner in = new Scanner(System.in)) {
            N = in.nextInt();
        }
        for (divSum = 0, i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                divSum += i;

            }

        }
        if (divSum == N) {
            System.out.println(N + " is a perfect Number");
        } else {
            System.out.println(N + " is not a Perfect Number");
        }
    }
}
