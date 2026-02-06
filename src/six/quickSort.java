package six;

public class quickSort implements SortingAlgorithm{


    public static void main(String[] args) {

    }

    public int[] quickSort(int[] arr, int lowIndex, int highIndex) {

        int midpoint = lowIndex + (highIndex - lowIndex) / 2;
       int  pivot = arr[midpoint]; // middle element is pivot

        // okay so it is the first index , last and middle
       boolean done = false;
        while (!done) {  // if the low index is smaller than the pivot then you move forward
            while (arr[lowIndex] < pivot) { // ur just rearranging the whole list so everything on the left is smaller and the right is bigger
                lowIndex += 1;
            } // when you find an element that is bigger than the pivot leave it and if you find one that is smaller then you swap the positions
            while (pivot < arr[highIndex]) {
                highIndex -= 1;
            }

            if (lowIndex >= highIndex) {
                done = true;
            }
            else {
               int  temp = arr[lowIndex];
                arr[lowIndex] = arr[highIndex];
                arr[highIndex] = temp;

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

 the i is tracking where the last position was
 and the j is scannign the array

so only if it is smaller than pivot that you increment i to


ohh okay so its smaller than pivot and then pivot and then the randoms
so rn i is nothing and then j is scanning through the randoms
so if one of the randoms is less than the pivot then itll swap with the most recent index of the small that was just sorted which is what i is holding
and if its greater then it does nothing

you are only doing the smaller ones and then the biggest one will just eventually be pushed to the end
 */
