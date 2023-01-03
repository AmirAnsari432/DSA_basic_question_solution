package recursion;

public class calculateFactrorial {

    public static int calculateFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_num1 = calculateFact(n - 1);
        int fact_n = n * fact_num1;
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 6;
        int ans = calculateFact(n);
        System.out.println(ans);

    }
}
