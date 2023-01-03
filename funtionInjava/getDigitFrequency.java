package funtionInjava;

import java.util.Scanner;

public class getDigitFrequency {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int d = in.nextInt();
            int f = getDigitfreq(n, d);
            System.out.println(f);
        }

    }

    public static int getDigitfreq(int n, int d) {
        int rv = 0;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            if (dig == d) {
                rv++;
            }
        }
        return rv;
    }

}
