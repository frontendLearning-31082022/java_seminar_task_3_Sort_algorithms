package sort_algorithms;
import static sort_algorithms.Actions.*;

public class Quick {

    public static void sort(Comparable[] array) {

        int size = array.length;
        recur_quick(array, 0, size-1);
    }

    private static void recur_quick(Comparable[] array, int min, int max) {
        int size = array.length;
        if (size == 0) return;
        if (min >= max) return;

        int middleIndex = min + (max - min) / 2;
        Comparable middleElem=array[middleIndex];

        int i=min; int j=max;
        while (i<=j){
            while (less(array[i],middleElem))i++;
            while (less(middleElem,array[j]))j--;

            if (i<=j){
                exch(array,i,j);
                i++;j--;
            }
        }

        if (min<j)recur_quick(array,min,j);
        if (max>i)recur_quick(array,i,max);
    }

    public static void main(String[] args) {
        Comparable[] array = {2, 5, 9, 1, 3, 8, 3, 6};

        Quick.sort(array);
        new String();
    }

}
