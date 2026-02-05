package six;
public class bubbleSort {

    public void bubbleSortMethod(int[] array1, int arraySize){

            for (int i = 0; i < array1.length - 1; i++) {
                for (int j = 0; j < array1.length - i - 1; j++) {
                    // its arraylength-i-1 because you are trying to swap adjacent elements
                    // so its saying dont go past the last element arraylength-1
                    // j has to stop 1 before the last index because its comparring j and j+1 so it would go out of bounds if you didnt have the minus 1
                    if (array1[j] > array1[j+1]) {
                        int temp = array1[j];
                        array1[j] = array1[j + 1];
                        array1[j + 1] = temp;
                    }
                }
            } // end for loops
        } // end bubbleSortMethod

// on the first pass i=0 and you are looking at j=0 which is i=0 also on the first pass they are the same
    // so i want to compare adjacent so im going to look at the first index j=0 and second index which is j+1 which is also i+1 since you start at 0
    // so i want to stop one before the last one because when you do the j+1 part it would go out of bounds
    // then you are going to do that whole loop and organize it through one time with i=0
    // then you are going to do it again all through the list so what does the list look like after the firs pass, it is just the pairs next to each other are sorted
    // so when i= 1 it loops back through the whole list and does it again, but are you now ignoring i=0 or is that sorted already?

    //becayse each time you compare itll swap and then itll compare what was jsut the larger one to the next element
//so the largest goes to the end basically and then the smallest will automatically be at the front sice the large ones are being moves
}
