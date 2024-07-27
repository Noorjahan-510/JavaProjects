package org.example;
import java.util.*;

public class IfElse {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        if(age<18){
            System.out.println("You can't vote");
        }
        else{
            System.out.println("You can vote");
        }
    }
}
