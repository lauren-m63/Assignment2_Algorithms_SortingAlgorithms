package six;

public class selectionSort implements SortingAlgorithm{

   public int[] selectionSort(int[] numbers) {

       for (int i = 0; i < numbers.length - 1; i++) {
           // Find index of smallest remaining element
           int indexSmallest = i;
           for (int j = i + 1; j < numbers.length; j++) {
               if (numbers[j] < numbers[indexSmallest]) {
                   indexSmallest = j; // index so this is fine
               }
           }


           // Swap numbers[i] and numbers[indexSmallest]
           int temp = numbers[i];
           numbers[i] = numbers[indexSmallest];
           numbers[indexSmallest] = temp;
       }

       return numbers;


   } // end method

} // end class

/*
first you go through the whole lsit and find the smallest number
then you swap it with the lowest index ?
then you look only at i+1 and ignore the already sorted


 */