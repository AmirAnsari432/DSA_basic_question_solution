package BasicLevelQues;

import java.util.Scanner;

public class armStrongNumber {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N, temp = 0, rightDigit;
            N = in.nextInt();

            temp = N;
            int sum = 0;

            while (temp != 0) {

                rightDigit = temp % 10;
                sum = sum + (rightDigit * rightDigit * rightDigit);
                temp = temp / 10;

            }
            if (sum == N) {
                System.out.print(N + " is armstrong number ");
            } else {
                System.out.print(N + " is not armstrong number ");

            }
        }

    }
}
