package oops2;

public class Vehicle_inheritance {
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
        System.out.println("Vehicale started");
    }
}
