import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Создать список целых чисел (заполнить случайными числами).
//        Найти минимальное, максимальное и среднее из этого списка.
public class task_2 {
    public static void main(String[] args) {

        List<Integer> listDigits=List.of(3,32,7,324,8,23,21356,9,234,67,322,6,345,8679,23,6,1,556);

        int min= listDigits.stream().min(Integer::compareTo).get();
        int max= listDigits.stream().max(Integer::compareTo).get();

        double avrReal= listDigits.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
        Optional<Integer> optionElem=listDigits.stream().min(Comparator.comparingDouble(i->Math.abs(i-avrReal)));
        int avrExisted=optionElem.get();

        System.out.printf("Min val %d, Max val %d, AvrExisted %d%n",min,max,avrExisted);

    }


}
