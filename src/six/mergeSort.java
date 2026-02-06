package six;

public class mergeSort implements SortingAlgorithm{

    public int[] sorty(int[] input) {
        int []arr = input.clone();
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }
    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) { // if the left is small already - if its less then not split
            int mid = (left + right) / 2; // split array
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    // its recursive so calss itself obvi

    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;      // left half
        int j = mid + 1;   // right half
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // actually sorting in this method and just doing the usual
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, left, temp.length);

    } // end sort method
} // end class

// runtime is O (n log n)
// recursivley sort each half and merge the two sorted halves
// the one where you divide everything into single arrays and then do the pairs and then do the pairs with the pairs etc.
