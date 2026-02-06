package seven;

// sorry i am not capitalizing any of my classes i forgot that was a convention until rn

/*
since they all implement the same interface i can make one tester class to run all
of the objects with different specifics (different actual sorting method)

so instead of having ot make a bunch of differnet objects to use their sorting method
i can just make one SortingAlgorithm method and create new of those objects #polymorhpism
 */

import six.SortingAlgorithm;

import java.util.Random;

public class tester {

    private SortingAlgorithm sorting; //

    public tester(SortingAlgorithm sorting) { //sa bullet 1 constructor
        this.sorting = sorting;
    }

    public double singleTest(int size){ // make time MILLISEC ms
        int [] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }

        long start = System.currentTimeMillis();
        sorting.sorty(arr);  // my sorting algorithms of differnet types with my made up array

        long end = System.currentTimeMillis();

        return (end - start);

    } // end single test

    public void test (int iterations, int size){
        double totaltime = 0;
        int [] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            totaltime += singleTest(size);
        }
        double avgtime = totaltime / iterations;
        System.out.println(sorting.getClass().toString() + "time" + totaltime);

    } // end test method

    /*
    Should run the singleTest method as many times as the number of
iterations provided and print to the console the average
 time the algorithm takes to sort an array of
the given size.
     */



} // end class
