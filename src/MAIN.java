import seven.tester;
import six.*;

public class MAIN {

    // this is to run my tester with my interface and all my sorting

    public static void main (String[] args) {
        int size= 1000;
        int iterations = 10;

        new tester(new bubbleSort()).test(iterations, size);
        new tester(new insertionSort()).test(iterations, size);
        new tester(new selectionSort()).test(iterations, size);
        new tester(new shellSort()).test(iterations, size);
        new tester(new quickSort()).test(iterations, size);
        new tester(new mergeSort()).test(iterations, size);
    }
}
