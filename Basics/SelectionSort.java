public class SelectionSort {
    public static void main(String args[]) {
        int[] arr = {4, 3, 2, 1};
        sel(arr, 4, 0);
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sel(int[] arr, int r, int i) {
        if (r == 1) {
            return;
        } else if (i < r - 1) {
            if (arr[i] > arr[r - 1]) {
                int temp = arr[i];
                arr[i] = arr[r - 1];
                arr[r - 1] = temp;
            }
            sel(arr, r, i + 1);
        } else {
            sel(arr, r - 1, 0);
        }
    }
}
