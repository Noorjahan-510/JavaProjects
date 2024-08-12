package oops3.learnPackage;

import oops3.learnEncapsulation.MainInEncapsulation;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Teacher obj = new Teacher();
        obj.classNo=10;
        obj.degree = "Bachelors";   //can use in same package
        //obj.id=123; can't use id bcz it's private property of Teacher
        MainInEncapsulation.printHello();
    }
}
