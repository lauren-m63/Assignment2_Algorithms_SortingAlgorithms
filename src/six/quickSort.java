package six;

public class quickSort {


    public static void main(String[] args) {

    }

    public int[] quickSort(int[] arr, int lowIndex, int highIndex) {

// Pick middle element as pivot
        int midpoint = lowIndex + (highIndex - lowIndex) / 2;
       int  pivot = arr[midpoint];

       boolean done = false;
        while (!done) {
            while (arr[lowIndex] < pivot) {
                lowIndex += 1;
            }
            while (pivot < arr[highIndex]) {
                highIndex -= 1;
            }

            // If zero or one elements remain, then all numbers are
            // partitioned
            if (lowIndex >= highIndex) {
                done = true;
            }
            else {
                // Swap numbers[lowIndex] and numbers[highIndex]
               int  temp = arr[lowIndex];
                arr[lowIndex] = arr[highIndex];
                arr[highIndex] = temp;

                // Update lowIndex and highIndex
                lowIndex += 1;
                highIndex -= 1;
            }
        }

        return arr;
    }
}

/*

this is the one where you pivot
quicksort you pick the pivot element which is just the middle and now you have like 3 a
and then you have the two arrays one above and one below the pivot which is jsut median

split everything around the pivot into smaller arrays
recursive sort left and right of subarrays ?

 */
