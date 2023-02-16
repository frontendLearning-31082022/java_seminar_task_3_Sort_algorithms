package sort_algorithms;

import static sort_algorithms.Actions.*;

public class Bubble {

    public static void sort (Comparable[] array){
        boolean isSorted=false;
        int size = array.length;

        while (!isSorted){
            isSorted=true;

            for (int i = 0; i <size-1 ; i++) {
                if (less(array[i+1],array[i])){
                    exch(array,i,i+1);
                    isSorted=false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] array={2,5,9,1,3,8,3,6};

        Bubble.sort(array);
        new String();
    }
}
