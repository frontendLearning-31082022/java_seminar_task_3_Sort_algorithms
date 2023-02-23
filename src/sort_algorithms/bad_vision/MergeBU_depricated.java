package sort_algorithms.bad_vision;

import static sort_algorithms.Actions.*;
public class MergeBU_depricated {

    public static void sort(Comparable[] array) {
        int size = array.length;

        Comparable[] aux=new Comparable[size];
        for (int len = 1; len <size ; len*=2) {
            for (int lo = 0; lo <size-len ; lo+=len+len) {
                int mid=lo+len-1;
                int hi=Math.min(lo+len+len-1,size-1);
                Merge_depricated.merge(array,aux,lo,mid,hi);
            }

        }
        isSorted(array);


    }

    public static void main(String[] args) {
        Comparable[] array={"M","E","R","G","E","S","O","R","T","E","X","A","M","P","L","E"};

        MergeBU_depricated.sort(array);
        new String();
    }
}
