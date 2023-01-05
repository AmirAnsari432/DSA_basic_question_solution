package recursion;

public class printNumerIncre {
    public static void printIncreamentNum(int n, int num) {
        if (n == num) {
            return;
        }
        System.out.println(n);
        printIncreamentNum(n + 1, num);
    }

    public static void main(String[] args) {
        int n = 1;
        int num = 6;
        printIncreamentNum(n, num);

    }

}
