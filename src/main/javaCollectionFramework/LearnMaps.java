package javaCollectionFramework;

import java.util.*;

public class LearnMaps {
    public static void main(String[] args) {
    //    ArrayList<Integer> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("US", "United State");
        map.put("IN", "India");
        map.put("IN", "India2");  //India2 will be replace in IN if already present
        map.put("en", "England");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for(Map.Entry<String,String> entry : entries){
            System.out.println(entry.getKey()+","+entry.getValue());
        }

//        ArrayList<String> keys = new ArrayList<>(map.keySet());
//        Collection<String> values =  map.values();
        //System.out.println(keys);
//        System.out.println(values);

//        map.remove("US");
//        System.out.println(map.containsKey("IN"));
//
//        System.out.println(map);
//        System.out.println(map.get("en"));
//        System.out.println(map.getOrDefault("pn","others"));  //when pn not present default value will be others
   }
}
