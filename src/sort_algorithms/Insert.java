package sort_algorithms;
import static sort_algorithms.Actions.*;

public class Insert {
    public static void sort (Comparable[] array){

        int size = array.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j >0 ; j--) {
                if (!less(array[j],array[j-1]))break;

                exch(array,j,j-1);

                assert isSorted(array,0,i);}
            assert isSorted(array)  ; }
    }


    public static void main(String[] args) {
        Comparable[] array={2,5,9,1,3,8,3,6};

        Insert.sort(array);
    }

}
