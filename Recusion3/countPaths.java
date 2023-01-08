package Recusion3;

public class countPaths {

    public static int countPath(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        if (i == n || j == m) {
            return 0;
        }

        // move downwards
        int downPath = countPath(i + 1, j, n, m);

        // move rightPath

        int rightPath = countPath(i, j + 1, n, m);
        return downPath + rightPath;

    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int result = countPath(0, 0, n, m);
        System.out.println(result);
    }

}