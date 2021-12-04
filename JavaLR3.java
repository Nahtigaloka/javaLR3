package javalr3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class JavaLR3 {

    public static final Random random = new Random();
    
    public static void main(String[] args) {
        int N=50000;
        List<Integer> List = new LinkedList<>();
        System.out.printf("%15s %15s %20s %5s\n\n","Method","Type of List","Num of operations","Time(ms)");
        
        //Добавление в LinkedList
        long startTime = System.currentTimeMillis();
        for (int i =0;i<N;i++){
            List.add(random.nextInt());
        }
        long endTime =System.currentTimeMillis();
        long dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","add","LinkedList",N,dur);
        
        //Извлечение из LinkedList
        startTime = System.currentTimeMillis();
        for (int i =0;i<N;i++){
            List.get(random.nextInt(N-1));
        }
        endTime =System.currentTimeMillis();
        dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","get","LinkedList",N,dur);

        //Удаление из LinkedList
        startTime = System.currentTimeMillis();
        for (int i =N-1;i>=0;i--){
            List.remove(i);
        }
        endTime =System.currentTimeMillis();
        dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","remove","LinkedList",N,dur);
        
        List=new ArrayList<>();
        
        //Добавление в ArrayList
        startTime = System.currentTimeMillis();
        for (int i =0;i<N;i++){
            List.add(random.nextInt());
        }
        endTime =System.currentTimeMillis();
        dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","add","ArrayList",N,dur);
        
        //Извлечение из ArrayList
        startTime = System.currentTimeMillis();
        for (int i =0;i<N;i++){
           List.get(random.nextInt(N-1));
        }
        endTime =System.currentTimeMillis();
        dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","get","ArrayList",N,dur);
        
        //Удаление из ArrayList
        startTime = System.currentTimeMillis();
        for (int i =N-1;i>=0;i--){
            List.remove(i);
        }
        endTime =System.currentTimeMillis();
        dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","remove","ArrayList",N,dur);
//         Method    Type of List    Num of operations Time(ms)
//
//            add      LinkedList           50000         10
//
//            get      LinkedList           50000        966
//
//         remove      LinkedList           50000          2
//
//            add       ArrayList           50000          2
//
//            get       ArrayList           50000          2
//
//         remove       ArrayList           50000          2
    }
    
}

