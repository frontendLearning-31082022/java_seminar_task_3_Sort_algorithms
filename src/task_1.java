import java.util.ArrayList;
import java.util.List;

//        Задание 1.
//                Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.
public class task_1 {

    public static void main(String[] args) {
        List<Integer> listDigits= new ArrayList<>(
                List.of(3, 32, 7, 324, 8, 23, 21356, 9, 234, 67, 322, 6, 345, 8679, 23, 6, 1, 556));

        listDigits.removeIf(x->x%2==0);

        listDigits.forEach(x->System.out.println(x));
    }
}
