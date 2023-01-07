package recursionAdvanceQues;

public class sortedStricly {

    public static boolean isSorted(int arr[], int indx) {
        if (indx == arr.length - 1) {
            return true;
        }

        if (arr[indx] < arr[indx + 1]) {
            return isSorted(arr, indx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5 };
        System.out.println(isSorted(arr, 0));

    }
}
