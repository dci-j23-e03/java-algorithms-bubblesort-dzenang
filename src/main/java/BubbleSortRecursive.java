public class BubbleSortRecursive {

    public void sort(int[] arr) {
        int temp;
        int n = arr.length;
        boolean swapped;
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap arr[i] and arr[i+1]
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped) {
                sort(arr);
            }
        }
}
