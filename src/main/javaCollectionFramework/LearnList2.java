package javaCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnList2 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("kiwi");
        fruits.add("papaya");
        fruits.add("apple");
        fruits.add("mango");
        for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }
        Iterator<String> fi = fruits.iterator();    //Iterartor comes from collection, listiterator is also there in list interface
        while(fi.hasNext()){
            System.out.println(fi.next());
        }
        List<String> smallList = fruits.subList(1,3);
        System.out.println(smallList);
    }
}
