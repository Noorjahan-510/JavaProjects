package oops2;
//public final class Vehicle_inheritance {     here it's final, car can not inherit
public class Vehicle_inheritance {

    //int gears;
    final int gears=4;

    public static void main(String[] args) {
        Vehicle_inheritance v1= new Vehicle_inheritance(2);
    //    v1.gears=6;  //can't update gears value bcz it's final.
    }
    int wheelsCount;
    String model;

    Vehicle_inheritance(){
        System.out.println("creating vehicle instance");
    }
    Vehicle_inheritance(int wheelsCount){
        this.wheelsCount=wheelsCount;
        System.out.println("creating vehicle with wheels");
    }

    void start(){
        System.out.println("Vehicle started");
    }

    final void acceleration(){                 // can not be override in child class bcz it's final
        System.out.println("vehicle is accelerating");
    }
}
