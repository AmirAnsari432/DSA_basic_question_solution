package recursionAdvanceQues;

public class mergeSort {

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int idex1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idex1 <= mid && idx2 <= ei) {
            if (arr[idex1] <= arr[idx2]) {
                merged[x++] = arr[idex1++];

            } else {
                merged[x++] = arr[idx2++];
            }

        }
        while (idex1 <= mid) {
            merged[x++] = arr[idex1++];

        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] aar, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(aar, si, mid);
        divide(aar, mid + 1, ei);
        conquer(aar, si, mid, ei);

    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 8 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
