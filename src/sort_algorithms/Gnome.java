package sort_algorithms;

import static sort_algorithms.Actions.*;

public class Gnome {

    public static void sort(Comparable[] array) {
        int size = array.length;
        int index = 1;
        int lastIndex = index + 1;

        while (index < size) {
            if (less(array[index - 1], array[index])) {
                index = lastIndex;
                lastIndex++;
            } else {
                exch(array, index - 1, index);
                index--;
                if (index==0){
                    index=lastIndex;
                    lastIndex++;
                }

            }

        }


    }


    public static void main(String[] args) {
        Comparable[] array = {2, 5, 9, 1, 3, 8, 3, 6};

        Gnome.sort(array);
        new String();
    }

}
