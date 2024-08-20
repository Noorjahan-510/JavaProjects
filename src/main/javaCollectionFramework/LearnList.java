package javaCollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        //List<Integer> list2 = new LinkedList<>();

        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(1);
        System.out.println(list);

        System.out.println(list.get(0));
        list.set(1,20);
        list.add(4,60);
        list.remove(Integer.valueOf(1));
        System.out.println(list);
        System.out.println(list.indexOf(60));

//        list2.add(1);
//        list2.add(2);
//        list2.add(3);


//        System.out.println(list.size());
//        System.out.println(list.contains(20));
//        list.remove(1);     //remove that index's value
//        System.out.println(list);
//
//        list.remove(Integer.valueOf(60));  // 60 will be remove from arraylist
//        System.out.println(list);

        //list.addAll(list2);
        //list.removeAll(list2);
        //list.retainAll(list2);    // will print value of intersection
        //list.clear();

//        Object a[] = list.toArray();
//        for(Object e:a){
//            Integer temp = (Integer) e;
//            System.out.println(e);
//        }
//        System.out.println(list);
    }
}
