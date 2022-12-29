package advanceQues;

import java.util.*;


public class ReverseNumber {
    public static void reverseNumber(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a number that want to reverse");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.print("the reverse of given number is ");
            reverseNumber(num);
        }

    }

}
