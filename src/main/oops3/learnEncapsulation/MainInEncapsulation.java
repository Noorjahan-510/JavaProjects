package oops3.learnEncapsulation;

import oops3.learnPackage.Person;

public class MainInEncapsulation {

    public static void printHello(){
        System.out.println("Print Hello");
        //printHi(); non static can't be used in static
    }
    public void printHi(){
        System.out.println("Print Hi");
        printHello();  //static can be used inside static or non-static
    }

    static{
        System.out.println("called from the static block");
    }

    public static void main(String[] args) {
        MainInEncapsulation.printHello();

                Person p1 = new Person();
        p1.setAge(12);
        //p1.count=50;          //static variable count
        //Person.count = 50;
        Person p2 =new Person();
        Person p3 = new Person();
//        //System.out.println(p2.count);    //50
//
      System.out.println(Person.count);
//
//        System.out.println(p1.getAge());
       // Person.scientificName="ABC";   //can't change because scientificName is final
        System.out.println(Person.scientificName);
    }
    static {
        System.out.println("called from second static");
    }
}
