package six;

public class mergeSort implements SortingAlgorithm{

    public static void mergeSort(int[] arr, ) {
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
    }
    }
}

// runtime is O (n log n)
