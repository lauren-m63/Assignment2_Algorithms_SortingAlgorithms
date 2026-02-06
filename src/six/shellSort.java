package six;

public class shellSort implements SortingAlgorithm{


    public int[]sorty(int[] numbers) {
        int startIndex = 0; //CHANGE THI S ?? wai what
        int gap = numbers.length; //CHANGE THIS
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

        return numbers;
    } // end shellsort method

    } // end class
