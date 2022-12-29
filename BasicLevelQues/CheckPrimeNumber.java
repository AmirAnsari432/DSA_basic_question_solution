package BasicLevelQues;

import java.util.*;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int num, i, isPrime = 0;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a Integer");

            num = in.nextInt();
        }
        for (i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = 1;
                break;
            }
        }
        if (isPrime == 0) {
            System.out.println(num + " is a Prime Number ");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }

}
