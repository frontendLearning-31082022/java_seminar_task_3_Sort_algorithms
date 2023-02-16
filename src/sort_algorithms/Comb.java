package sort_algorithms;
import static sort_algorithms.Actions.*;

public class Comb {

    public static void sort (Comparable[] array) {
        boolean swapped = true;
        int size = array.length;
        int factor=size;

        while (factor>1 || swapped){
            if (factor>1)factor= (int) (factor/1.247330950103979);

            swapped = false;
            for (int i = 0; i + factor < size; i++) {
                if (less(array[i+factor],array[i])){
                    exch(array,i,i+factor);
                    swapped=true;
                }
            }

        }
    }


    public static void main(String[] args) {
        Comb comb=new Comb();
        Comparable[] array={2,5,9,1,3,8,3,6};

        comb.sort(array);
        new String();
    }

}
