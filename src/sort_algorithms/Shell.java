package sort_algorithms;
import java.util.Arrays;

import static sort_algorithms.Actions.*;

public class Shell {
    public static void sort(Comparable[] array) {
        int size=array.length;

        int offset=1;
        while (offset<size/3){
            offset=3*offset+1;
        }

        while (offset>=1){
            for (int i=offset;i<size;i++){
                for(int j=i;j>=offset;j-=offset){
//                    showIteration(array,i,j,"Итерация ");
//                    showIteration(array,j,j-area,"Сравнение ");
                    if (!less(array[j],array[j-offset])){break;}
                    exch(array,j,j-offset);
//                    showIteration(array,i,j,"Поменяли@@");
                }

            }
            assert isHsorted(array,offset);
            offset/=3;
        }
        assert isSorted(array);


    }

    void showIteration(Comparable[] array,int el_i,int el_j,String comment){
//        return;

        if (el_i==el_j)return;

        String[] array_in=new String[array.length];
        for (int i = 0; i < array.length; i++) {
            array_in[i]=array[i].toString();
        }

        array_in[el_i]="{"+array_in[el_i]+"}";
        array_in[el_j]="{"+array_in[el_j]+"}";

        String print_res=String.join("\t",array_in);
        System.out.println(comment+"\t"+ print_res);
    }

    public static void main(String[] args) {
        Comparable[] array = {16, 2, 3, 1, 5, 9, 22, 55,8};
        Shell.sort(array);
    }
}

