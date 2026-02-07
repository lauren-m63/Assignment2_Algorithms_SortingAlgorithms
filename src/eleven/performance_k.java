package eleven;
import java.util.*;
import eleven.ksorted;
import seven.tester;
import six.*;
import six.bubbleSort;
import six.insertionSort;

public class performance_k {

    public static void main(String[] args) {

        // forgt all ot them lol

        SortingAlgorithm[] algorithms = {
                new bubbleSort(),
                new insertionSort(),
                new selectionSort(),
                new shellSort(),
                new quickSort(),
                new mergeSort()
        };

        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};

        for (int size : sizes) {
            int[] arr = new int[size];
            ksorted.ksortit(arr, 10); // k is 10

            for (SortingAlgorithm algo : algorithms) {
                tester t = new tester(algo);
                double time = t.singleTestK(arr.clone()); // clone keeps original intact
                System.out.println(algo.getClass().getSimpleName() + " size: " + size + " time: " + time + " nanoseconds");
            }

        }
       // ksorted.ksortit(arr);
    }// end main


}
