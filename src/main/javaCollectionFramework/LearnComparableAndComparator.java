package javaCollectionFramework;

import java.util.*;

class MyCustomComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.weight,o2.weight);
    }
}
public class LearnComparableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(4,"Leo",30);
        Animal a2 = new Animal(10, "Bruno", 15);
        Animal a3 = new Animal(3, "Meo", 5);
        Animal a4 = new Animal(3, "Deo", 5);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs);

        //Collections.sort(dogs,new MyCustomComparator());
        Collections.sort(dogs, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(dogs);
    }


}
