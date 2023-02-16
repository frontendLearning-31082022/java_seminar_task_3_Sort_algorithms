package sort_algorithms;

import static sort_algorithms.Actions.*;

public class Select {

    public static void sort (Comparable[] array){
        int size=array.length;

        for (int cur = 0; cur < size; cur++) {
            int min=cur;
            for (int j = cur+1; j < size; j++) {
                if (less(array[j],array[min]))min=j;
            }

            exch(array,cur,min);

            assert isSorted(array,0,cur);
        }
        assert isSorted(array);
    }



    public static void main(String[] args) {
        Comparable[] array={2,5,9,1,3,8,3,6};

        Select.sort(array);
    }


}
