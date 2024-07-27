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
//          String day = sc.next();
//        if (day.equals("Sunday") || day.equals("sunday") || day.equals("sun")) {
//            System.out.println("Holiday, Go to Home");
//        }else if(day.equals("Monday") || day.equals("Tuesday") ||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")||day.equals("Saturday")){
//            System.out.println("Working day");
//        }else {
//            System.out.println("Invalid input");
//        }

        // Ternary Operator(condition ? expression1 : expression2)-------------------

        int a = 30;
        int b = 210;
        int c = 110;   //with 1 more variable
        int max = 0;

        //max = a > b ? a : b;  // condition ? expression1 : expression2
        max = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println("value of max:" +max);


    }
}
