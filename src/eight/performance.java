package eight;

import java.io.*;

import six.*;
import six.SortingAlgorithm;
import seven.tester;

/*
A main function that runs the Tester.test() method with 20 iterations for each algorithm
for each of the following array sizes: 100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000
and produces a .txt file report with the results. B
e patient, but not too patient.
There should be no
need to run your code for hours.
 */

public class performance {

    public static void main(String[] args) {

        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int iterations = 20; // requireement


        // algor
        SortingAlgorithm[] algorithms = {
                new bubbleSort(),
                new insertionSort(),
                new selectionSort(),
                new shellSort(),
                new quickSort(),
                new mergeSort()
        };
// wait do i need version or does it over write other files.
        int version= 1;
        try (PrintWriter writer = new PrintWriter("results_v" + version+ ".txt")) {

            for (SortingAlgorithm sa : algorithms) {
                writer.println("Sorting algorithm – " + sa.getClass().getSimpleName()); // simple name instead o fo tostring
                for (int size : sizes) {
                    // Skip huge sizes for slow sorts
                    if ((sa instanceof bubbleSort || sa instanceof insertionSort || sa instanceof selectionSort)
                            && size > 150000) {
                        writer.println("Skipping size " + size + " for slow algorithm.");
                        continue;
                    } // these ones are really slow so not testing always them lol bc nsqaured
                    // 750000 so slow

                    tester t = new tester(sa);
                    double totalTime = 0;
                    for (int i = 0; i < iterations; i++) {
                        totalTime += t.singleTest(size);
                    } // end for i iterations

                    double avgTime = totalTime / iterations;
                    writer.println("Sorted " + size + " elements in " + avgTime + " ms (avg)");
                } // end for size siezes

                writer.println(); // blank line between algorithms

            } // end for algori


            System.out.println("Performance report written to results[version?].txt- written to file");
        } catch (Exception e) {
            e.printStackTrace();
        }


    } // end main



} // end class
