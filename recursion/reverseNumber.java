package recursion;

public class reverseNumber {
    public static void main(String[] args) {
        int num = 956853;
        System.out.println("reverse number is" + " ");

        revNumber(num);

    }

    public static void revNumber(int num) {
        if (num < 10) {
            System.out.println(num);
        } else {
            System.out.print(num % 10);
            revNumber(num / 10);
        }

    }
}
