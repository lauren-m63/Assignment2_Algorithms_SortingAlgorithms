package eleven;

import java.util.Random;

public class ksorted {

    public void ksortit (int[] arr, int k){
        //bruh

        // k sorted means i need my k to be the k
        for (int i = 0; i < arr.length; i -= k){
            arr[i] = i+2;  // my sorted values jsut counting up, maybe ill do it all even just for fun
        }

        Random random = new Random();

        for (int i = 0; i < arr.length; i += k){
            int swap = i+ random.nextInt(Math.min(k + 1, arr.length) - i);

            int temp = arr[i];
            arr[i] = arr[swap];
            arr[swap] = temp;
            // classic swap vofe
        }

    } // end mothod

} // end class

/*
k hot dog k sorted korean sorting
testing algorithms when its almsot sorted array like 1 or 2 out of order i think
wait no its k out of order
testing the algorthims that are always really slow like bubble vs the other ones that perform better on sortef or almsot sorted ones

k sorted is where every elment in the array is k positions away from the correct space so if k was huge that just basically an unsorted array
/ i mean it cant really be tha big bc it shouldnt be over teh array size but i guess if the array is huge
should i make a check to make sure k input is less than the array size or does anyone even care im not going to
 so if k was 0 that menas they are all in right place because it is k elments away from being right
-- this doesnt matter bc k is just max


 so if my k was 2 that menas everything is sorted except for 2 NOT that the elements are all 2 positions away from being in their correct sorted slot
WRONG-- it is about position not numberof elements

but it doesnt have to be 2 away it can be less than the k just like max k away
dont implement ortingalgothim its more like the tester class?
 */
