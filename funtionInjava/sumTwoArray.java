package funtionInjava;

public class sumTwoArray {
    public static int SumArr(int[] a, int[] b, int n, int m) {
        int[] sum = new int[n];
        int i = n - 1;
        int j = m - 1;
        int k = n - 1;
        int carry = 0;
        int s = 0;

        while (j >= 0) {
            // find sum of orresponding ele
            // both arr
            s = a[i] + b[j] + carry;
            sum[k] = s % 10;
            // find carry for next sum
            carry = s / 10;
            k--;
            i--;
            j--;
        }
        // if second arr size is less then first arr size

        while (i >= 0) {
            s = a[i] + carry;
            sum[k] = s % 10;
            carry = s / 10;
            i--;
            k--;
        }
        int ans = 0;
        if (carry == 1) {
            ans = 10;
        }

        for (i = 0; i <= n - 1; i++) {
            ans += sum[i];
            ans *= 10;
        }
        return ans / 10;

    }

    public static int calSum(int a[], int b[], int n, int m) {
        if (n >= m) {
            return SumArr(a, b, n, m);
        } else {
            return SumArr(b, a, m, n);
        }
    }

    public static void main(String[] args) {
        int a[] = { 9, 3, 9 };
        int b[] = { 6, 1 };
        int n = a.length;
        int m = b.length;

        System.out.println(calSum(a, b, n, m));

    }
}
