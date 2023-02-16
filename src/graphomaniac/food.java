package graphomaniac;//        Задание 1.
//                Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class food {
    static String pathLargeListNums="src/graphomaniac.task_1_data/rndLongs";


    void food(){

    }
    static class WaysToRemoveEven{

        static List<Long> lambdaWay(List<Long> input){
            input.removeIf(x->x%2==0);

            return input;
        }
//        static List<Long> loopWay(List<Long> input){
//
//
//
//            input.removeIf(x->x%2==0);
//
//            return input;
//        }



    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, IOException {

        long count= 50_000_0;

//        List<Long> data=new Random().longs(0,1000).limit(count).boxed()
//                .collect(Collectors.toList());
                List<Long> data=loadFromFileLarge();

        System.out.println("Loaded size digits - "+data.size());



//        writeToFile(data);

            for (Method method : WaysToRemoveEven.class.newInstance().getClass().getDeclaredMethods()) {
                if (method.isSynthetic())continue;

                Date date=new Date();
                Object value = method.invoke(null,new ArrayList<>(data));
                long execTimeSecs=(new Date().getTime()-date.getTime())/1000;
                System.out.println("Exec time for "+method.getName()+" is "+execTimeSecs+" secs");

            }



        new String();

    }

    private static List<Long> loadFromFileLarge() throws IOException {

        BufferedReader FileReader = null;



        String s;
        FileReader = new BufferedReader(new InputStreamReader(new FileInputStream(pathLargeListNums), "UTF-8"));

        ArrayList<Long>SendReturn=new ArrayList<>();

        while((s=FileReader.readLine())!=null) {
            if (s.equals("")) { continue; }
            SendReturn.add(Long.parseLong(s));
//            String[] arrayToCountColumns = s.split("Ѽ");
        }


        return SendReturn;
    }

   static   void writeToFile(List<Long> longsDig) throws IOException {
       String res="";
       for (Long datum : longsDig) {
           res=res+datum+"\n";
       }

        FileWriter writer = new FileWriter(pathLargeListNums, true);
        writer.write(res);
        writer.flush();
        writer.close();
    }





}
