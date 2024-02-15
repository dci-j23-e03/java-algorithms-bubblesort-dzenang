public class BubbleSortRecursive2 {

    void sort (int[] array) {
        int n = array.length;
        boolean swapped = false;

        for (int i = 0; i <= n - 2; i++) {
            int temp;
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                swapped = true;
            }
        }

        if (swapped) {
            sort(array);
        }
    }
}
