import sort_algorithms.*;
import sort_algorithms.bad_vision.MergeBU_depricated;

//Реализовать алгоритмы сортировки
public class task_3 {
    public static void main(String[] args) {
//        Bubble
//        Shaker
//        Select
//        Shell
//        Insert
//        Comb
//        TreeBinary
//        Gnome

        Comparable[] array=null;

        array=getArray();
        Bubble.sort(array);

        array=getArray();
        Shaker.sort(array);

        array=getArray();
        Select.sort(array);

        array=getArray();
        Shell.sort(array);

        array=getArray();
        Insert.sort(array);

        array=getArray();
        Comb.sort(array);

        array=getArray();
        TreeBinary.sort(array);

        array=getArray();
        Gnome.sort(array);

        array= task_3.getArray();
        Quick.sort(array);

        array= task_3.getArray();
        Merge.sort(array);

        array= task_3.getArray();
        MergeBU.sort(array);


    }

    static Comparable[] getArray(){
       return new Comparable[]{2, 5, 9, 1, 3, 8, 3, 6};
     }
}
