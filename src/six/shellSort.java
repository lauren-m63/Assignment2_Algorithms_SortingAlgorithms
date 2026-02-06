package six;

public class shellSort implements SortingAlgorithm{


    public shellSort(int[] numbers, int startIndex, int gap) {
        for (int i = startIndex + gap; i < numbers.length; i += gap) {
            int j = i;
            while (j - gap >= startIndex && numbers[j] < numbers[j - gap]) {
                // Swap numbers[j] and numbers [j - gap]
                int temp = numbers[j];
                numbers[j] = numbers[j - gap];
                numbers[j - gap] = temp;
                j -= gap;
            }
        }


    } // end shellsort method
    } // end class
