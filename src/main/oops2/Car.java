package oops2;

public class Car extends Vehicle_inheritance {
    String color;

    Car(){
        //super();   //default constructor of parent will be called
        super(3); // now it will call parent's parameterized constructor
        System.out.println("Car is being creating");
    }
    void start(){              //method overrriding
        super.start();       //super invokes immidiate parent class method
        System.out.println("Car is starting");
    }
    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println(obj.wheelsCount);   //3
        obj.wheelsCount = 4;  //parent class property   //whhelscount value updating here
        obj.model= "155";
        obj.color = "blue";    //child class own property
        obj.start();
        System.out.println(obj.wheelsCount);   //4

    }
}
