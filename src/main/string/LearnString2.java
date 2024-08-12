package string;

import java.util.Scanner;

public class LearnString2 {
    public static void main(String[] args) {

//        String name="       noor     ";
//        System.out.println(name.toUpperCase());
//        System.out.println(name.trim());
//
//        System.out.println("Carpet".startsWith("Car"));
//        System.out.println("Carpet".endsWith("pet"));

        int age =123;
        String strAge = String.valueOf(age);
        System.out.println(age+2);   //125
        System.out.println(strAge+2); //1232

        String sentence="I am learning java";
        String newSentence= sentence.replace("java","javaScript");
//        System.out.println(sentence);
//        System.out.println(newSentence);
//        System.out.println(newSentence.contains("javaS"));
//        System.out.println(sentence.substring(3,18));
//        String words[]=sentence.split(" ");
//        for(String word :words){
//        System.out.println(word);}
        String str="     ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first name");
//        String fName = sc.nextLine();
//        System.out.println("Enter your last name");
//        String lName = sc.nextLine();
//
//        System.out.println("your full name is "+fName +" "+lName);
    }
}
