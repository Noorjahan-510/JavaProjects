package oops4;

public class LearnInnerClass {

    class Toy{
        int price;
    }

    static class PlayStation{
         int price;
    }
    public static void main(String[] args) {
        LearnInnerClass obj = new LearnInnerClass();
        Toy toy = obj.new Toy();     // when inner class is non static the we have to create obj of outer class then u can create object of inner class
        toy.price=50;
        PlayStation playstation = new LearnInnerClass.PlayStation(); //no need to create obj of outer class
    }
}
