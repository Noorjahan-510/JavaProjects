package oops4;

public class LearnAbstract {
    public static void main(String[] args) {
       // Vehicle v1 = new Vehicle();  can't crete object of Vehicle bcz Vehicle is abstract class.
        Car c1 = new Car();    // So here we created a subclass Car, in which we implemented abstract methods of Vehicle class, then we create object of subclass Car and using those methods.
        c1.accelerate();
        c1.breaks(4);
        Vehicle obj = new Car();

        obj.honks();  // honks is non-abstract method so no need to implement in subclass, we can implement but that will be the implementation of car.

    }
}
abstract class Vehicle{
    abstract  void accelerate();  // abstract method cant have body
    abstract int breaks(int wheels);

    void honks(){
        System.out.println("Vehicle honks");
    }
}
class Car extends Vehicle{    // either make it abstract or implement methods of parent class
    @Override      //annotation, it means this method is implemented in parent class
    void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    int breaks(int wheels) {
        System.out.println("Car breaks are pushing");
        return wheels;
    }

//    void honks(){
//        System.out.println("Car is Honked");
//    }

}
class Scooter extends Vehicle{

    @Override
    void accelerate() {

    }

    @Override
    int breaks(int wheels) {
        return 0;
    }
}
