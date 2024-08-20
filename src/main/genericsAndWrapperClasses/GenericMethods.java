package genericsAndWrapperClasses;

public class GenericMethods {
    public static void main(String[] args) {
       printData("Hello");
       printData(123);

       GenericMethods demo = new GenericMethods();
       demo.doubleData("Hi");
       demo.doubleData(456);
    }

    public static <E> void printData(E data){
        System.out.println(data);
    }
    <T> void doubleData(T data){
        System.out.println(data);
    }

}
