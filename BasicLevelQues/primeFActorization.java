package BasicLevelQues;
import java.util.Scanner;

public class primeFActorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int div = 2; div * div <= n; div++) {
            while (n != 0) {
                n = n / 10;
                System.out.print(div + " ");
            }
        }
        if (n != 0) {
            System.out.print(n);
        }

    }
}
