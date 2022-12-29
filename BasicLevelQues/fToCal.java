package BasicLevelQues;

import java.util.Scanner;

public class fToCal {
    public static void main(String[] args) {
        float fahren, cal;
        try (Scanner in = new Scanner(System.in)) {
            fahren = in.nextFloat();
        }
        cal = 5 * (fahren - 32) / 9;
        System.out.println("tempreture in fahren " + cal);
    }
}
