package oops4;

public class LearnInterface {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.walk();
        monkey.drinks();   // here drink is present in both interface, but it's implemented in Monkey class, So there is no ambiguity in interface of multiple inheritance.
       // Animal.legs =5; // not possible bcz its by default final
    }
}

interface Animal{
    int legs = 4; //by default it is public staticc final
     void eats();
     void drinks();

     default void walk(){
         System.out.println("Animal is walking");
     }
}
interface Human{
    //void walk();
    void drinks();
}

class Monkey implements Animal, Human{       // it means class can implement multiple interfaces, but can not extend multiple class bcz it can create ambiguity(like same methods in two diff classes)

    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking");
    }


}
