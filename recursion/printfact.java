package recursion;

public class printfact {
    public static int caluFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int fact_num = caluFact(n - 1);
        int fact_n = n * fact_num;
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = caluFact(n);
        System.out.println(ans);

    }

}
