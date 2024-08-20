package genericsAndWrapperClasses;

import java.util.ArrayList;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String, String> o1 = new Dog<>("i123", "leo");
        Dog<Integer,String> o2 = new Dog<>(12,"i123");

        Dog<Integer, String> o3 = new Dog<>(12,"Jon");

        System.out.println(o3.getId());

        //ArrayList<Integer> list= new Integer<>();
    }
}
class Dog<T, V>{
   T id;
   V name;
    public Dog(T id, V name){
        this.id = id;
    }
    T getId(){
        return id;
    }
}