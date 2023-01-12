package recursionAdvanceQues;

public class Char {
    public static void printParmutation(int n, int[] array) {
        for (int i = 0; i <= n; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public void findParmutation(int[] array, int size, int n) {
        if (size == 1) {
            printParmutation(n, array);

        }
        for (int i = 0; i < size; i++) {
            findParmutation(array, size - 1, n);
            if (size % 2 == 1) {
                int temp = array[0];
                array[0] = array[size - 1];
                array[size - 1] = temp;
            } else {

                int temp = array[i];
                array[i] = array[size - 1];
                array[size - 1] = temp;

            }

        }

    }

    public static void main(String[] args) {
        Char p = new Char();

        int[] array = { 123 };
        System.out.println(array);
        p.findParmutation(array, array.length, array.length);

    }

}
