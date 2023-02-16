package sort_algorithms;

import java.util.Arrays;
import static sort_algorithms.Actions.*;

public class Heap {

    public static void sort (Comparable[] array){
        new HeapStructure(array);
    }

    public static class HeapStructure{
        Comparable[] array;
        int size;


        HeapStructure(Comparable[] array){
            this.array=array;
            this.size=array.length;

            for (int i = array.length / 2 - 1; i >= 0; i--)
                heapify(size,i);

            lastElmentToZeroFOREACH();
        }

        void heapify(int size,int rootIndex){
            int largest=findLargest(size,rootIndex);
            if (largest != rootIndex) {
                exch(array, rootIndex, largest);

                // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
                heapify(size,largest);
            }

        }

        void lastElmentToZeroFOREACH(){
            for (int i=size-1; i>=0; i--)
            {
                exch(array,0,i);

                // Вызываем процедуру heapify на уменьшенной куче
                int sizeDecrease=i;
                heapify(sizeDecrease,0);
            }
        }

        void printArray()
        {
            for (int i=0; i<size; ++i)
                System.out.print(array[i]+" ");
            System.out.println();
        }

        int findLargest(int size,int rootIndex){
            int largest = rootIndex;
            int left = 2*rootIndex + 1;
            int right = 2*rootIndex + 2;

            // Если левый дочерний элемент больше корня
            if (left < size && less(array[largest],array[left]))
                largest = left;

            // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
            if (right < size && less(array[largest],array[right]))
                largest = right;
            return largest;
        }

    }

    public static void main(String[] args) {
        Comparable[] array={2,5,9,1,3,8,3,6};

        Heap.sort(array);
        new String();
    }

}
