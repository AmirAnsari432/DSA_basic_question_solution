package recursion;

public class calculatePower {

    public static int calcPower(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int powern = calcPower(x, n - 1);
        int Xpow = x * powern;
        return Xpow;

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
