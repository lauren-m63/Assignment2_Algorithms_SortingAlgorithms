package eleven;
import java.util.*;
import eleven.ksorted;
import seven.tester;
import six.insertionSort;

public class performance_k {

    public static void main(String[] args) {

        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};

        for (int size : sizes) {
            int[] arr = new int[size];
            ksorted.ksortit(arr);

            tester t= new tester(new insertionSort());
            double time= t.singleTest(size);
        System.out.println("size: " + size+  " and time:  "+ "ms");


        }
       // ksorted.ksortit(arr);
    }// end main


}
