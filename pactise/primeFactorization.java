package pactise;

import java.util.*;

public class primeFactorization {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int div = 2; div * div <= n; div++) {
                while (n % div == 0) {
                    n = n / div;
                    System.out.println(div);
                }

            }
            if (n != 1) {
                System.out.println(n);
            }

        }

    }
}
