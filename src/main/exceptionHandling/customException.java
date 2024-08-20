package exceptionHandling;

import java.util.Scanner;

public class customException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        try {
            int age = sc.nextInt();
            if (age > 100) {
//                throw new MyException("my Error");
                throw new ArithmeticException();

            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class MyException extends Exception{
    public  MyException(String message){
        super(message);
    }
}