import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Number is negative");
        } else if (number >= 1) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Plzz Enter a valid number");
        }

    }

}
