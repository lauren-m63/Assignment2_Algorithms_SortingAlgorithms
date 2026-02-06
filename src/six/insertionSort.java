package six;

public class insertionSort implements SortingAlgorithm{

    public int[] sorty(int[] numbers) {
            int i = 0;
           int  j = 0;
           int  temp = 0;  // Temporary variable for swap

        // the outer loop starts at 1 so why am i even making another i above
        // inner loop starts at current elemnt
            for (i = 1; i < numbers.length; ++i) {
                j = i;
                // Insert numbers[i] into sorted part
                // stopping once numbers[i] in correct position
                while (j > 0 && numbers[j] < numbers[j - 1]) {

                    // Swap numbers[j] and numbers[j - 1]
                    temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                            j = --j;
                }
            }
return numbers;
    }

}

/*
like playing cards where you sort from the left
start with the second element which is i
then you compare it with the first element i-1
if i is less than i-1 then you shift it so the lower one is first of the pair
now your on the second pass and you are looking at the third element now and comparing it with the second
if they are uneven then swap them and now compare them if you swapped with the very first element
now all the first 3 elements are sorted
so basically you are looking at one element and while that element is out of place shift it down so the smallest is first
so while they are uneven.. keep swapping which is the hwile loop




 */