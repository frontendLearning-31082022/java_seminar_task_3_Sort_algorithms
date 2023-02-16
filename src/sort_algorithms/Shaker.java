package sort_algorithms;

import static sort_algorithms.Actions.exch;
import static sort_algorithms.Actions.less;

public class Shaker {

    int start;
    int end;
    Comparable[] array;
    boolean swapped;

    Shaker(Comparable[] array) {
        this.array = array;
    }

    private void sortByObject() {
        start = 0;
        end = array.length - 1;

        while (start <= end) {
            swapped = false;

            bubleForward();
            end--;

            bubleBack();
            start++;

            if (!swapped) break;
        }

    }

    void bubleForward() {
        for (int i = start; i < end; i++) {
            if (less(array[i + 1], array[i])) {
                exch(array, i, i + 1);
                swapped = true;
            }
        }
    }

    void bubleBack() {
        for (int i = end; i > start; i--) {
            if (less(array[i], array[i - 1])) {
                exch(array, i, i - 1);
                swapped = true;
            }
        }
    }

    public static void sort(Comparable[] array) {
        Shaker shaker = new Shaker(array);
        shaker.sortByObject();
    }


    public static void main(String[] args) {
        Comparable[] array = {2, 5, 9, 1, 3, 8, 3, 6};

        Shaker.sort(array);
        new String();
    }


}
