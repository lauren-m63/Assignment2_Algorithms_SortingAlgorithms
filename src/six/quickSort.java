package six;

public class quickSort implements SortingAlgorithm{


    public int[] sorty(int[] arr) {
        int [] input = arr.clone();
        quickSort (arr, 0, arr.length-1);
        return input;
    }

    private void quickSort (int[] arr, int lowIndex, int highIndex) {

        if (lowIndex <= highIndex) return; // base case?

        int midpoint = lowIndex + (highIndex - lowIndex) / 2;
        int  pivot = arr[midpoint]; // middle element is pivot

        int left= lowIndex;
        int right = highIndex;
        while (left <= right) {
            while (arr[left] <pivot) left++;
            while (arr[right] > pivot) right--;   // move right pointer to left

            if (left <= right) {  // swap elements if out of order
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        // Recursively sort left and right halves
        quickSort(arr, lowIndex, right);
        quickSort(arr, left, highIndex);

        } // end method
        // okay so it is the first index , last and middle
} // end class


/*

this is the one where you pivot
quicksort you pick the pivot element which is just the middle and now you have like 3 a
and then you have the two arrays one above and one below the pivot which is jsut median

split everything around the pivot into smaller arrays
recursive sort left and right of subarrays ?

 the i is tracking where the last position was
 and the j is scannign the array

so only if it is smaller than pivot that you increment i to


ohh okay so its smaller than pivot and then pivot and then the randoms
so rn i is nothing and then j is scanning through the randoms
so if one of the randoms is less than the pivot then itll swap with the most recent index of the small that was just sorted which is what i is holding
and if its greater then it does nothing

you are only doing the smaller ones and then the biggest one will just eventually be pushed to the end
 I HATE QUICKSORT
 */
