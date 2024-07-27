package org.example;
import java.util.*;

public class IfElse {
    public static void main(String[] args){
// ------------if--------
        Scanner sc = new Scanner(System.in);
//        int age =sc.nextInt();
//        if(age<18){
//            System.out.println("You can't vote");
//        }
//        else{
//            System.out.println("You can vote");
//        }
        //------------else if----------------
          String day = sc.next();
        if (day.equals("Sunday") || day.equals("sunday") || day.equals("sun")) {
            System.out.println("Holiday, Go to Home");
        }else if(day.equals("Monday") || day.equals("Tuesday") ||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")||day.equals("Saturday")){
            System.out.println("Working day");
        }else {
            System.out.println("Invalid input");
        }
    }
}
