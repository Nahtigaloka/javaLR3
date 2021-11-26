package javalr3;

import java.util.ArrayList;
import java.util.LinkedList;


public class JavaLR3 {

    public static void main(String[] args) {
        int N=20000;
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.printf("%15s %15s %20s %5s\n\n","Method","Type of List","Num of operations","Time(ms)");
        
        //Добавление
        long startTime = System.currentTimeMillis();
        for (int i =0;i<N;i++){
            linkedList.add(i*i);
        }
        long endTime =System.currentTimeMillis();
        long dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","add","LinkedList",N,dur);
        
        startTime = System.currentTimeMillis();
        for (int i =0;i<N;i++){
            arrayList.add(i*i);
        }
        endTime =System.currentTimeMillis();
        dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","add","ArrayList",N,dur);
        
        //Извлечение
        int value;
        startTime = System.currentTimeMillis();
        for (int i =0;i<N;i++){
            value=linkedList.get(i);
        }
        endTime =System.currentTimeMillis();
        dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","get","LinkedList",N,dur);
        
        startTime = System.currentTimeMillis();
        for (int i =0;i<N;i++){
            value=arrayList.get(i);
        }
        endTime =System.currentTimeMillis();
        dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","get","ArrayList",N,dur);
        
        //Добавление в середину
        startTime = System.currentTimeMillis();
        for (int i =0;i<N;i++){
            linkedList.add((N+i)/2,i*i);
        }
        endTime =System.currentTimeMillis();
        dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","middle add","LinkedList",N,dur);
        
        startTime = System.currentTimeMillis();
        for (int i =0;i<N;i++){
            arrayList.add((N+i)/2,i*i);
        }
        endTime =System.currentTimeMillis();
        dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","middle add","ArrayList",N,dur);
        
        //Удаление
        startTime = System.currentTimeMillis();
        for (int i =N-1;i>=0;i--){
            linkedList.remove(i);
        }
        endTime =System.currentTimeMillis();
        dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","remove","LinkedList",N,dur);
        
        startTime = System.currentTimeMillis();
        for (int i =N-1;i>=0;i--){
            arrayList.remove(i);
        }
        endTime =System.currentTimeMillis();
        dur=endTime-startTime;
        System.out.printf("%15s %15s %15s %10s\n\n","remove","ArrayList",N,dur);
        
//         Method    Type of List    Num of operations Time(ms)
//
//            add      LinkedList           20000          2
//
//            add       ArrayList           20000          2
//
//            get      LinkedList           20000        716
//
//            get       ArrayList           20000          3
//
//     middle add      LinkedList           20000       1627
//
//     middle add       ArrayList           20000         49
//
//         remove      LinkedList           20000       1530
//
//         remove       ArrayList           20000         43
    }
    
}
