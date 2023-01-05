package recursion;

public class sumOfNaturalNum {
    public static void sumNatural(int i, int n, int sum) {

        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;

        sumNatural(i + 1, n, sum);

    }

    public static void main(String[] args) {

        sumNatural(1, 5, 0);

    }
}
