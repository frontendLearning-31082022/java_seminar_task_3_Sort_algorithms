package sort_algorithms.bad_vision;

public class Merge_depricated {
    public static void sort (Comparable[] array){
        int size=array.length;
        Comparable[] tempArr=new Comparable[size];

        for (int len = 1; len < size; len*=2) {
            for (int lo = 0; lo <size-len ; lo+=len+len) {
                int mid= lo+len-1;
                int hi=Math.min(lo+len+len-1,size-1);



            }
        }

    }

    public static void main(String[] args) {
        Comparable[] array={"M","E","R","G","E","S","O","R","T","E","X","A","M","P","L","E"};

        Merge_depricated.sort(array);
        new String();
    }

    public static void merge(Comparable[] array, Comparable[] aux, int lo, int mid, int hi) {
    }
}
