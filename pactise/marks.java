package pactise;

import java.util.*;

public class marks {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int input;
            do {
                int marks = sc.nextInt();
                if (marks >= 90 && marks <= 100) {
                    System.out.println("this is good");
                } else if (marks <= 80 && marks >= 60) {
                    System.out.println("This is also good ");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is good as well ");
                } else {
                    System.out.println("Invalid");
                }
                System.out.println("want to continue ? yes(1) or no (0)");
                input = sc.nextInt();

            }

            while (input == 1);
        }

    }
}
