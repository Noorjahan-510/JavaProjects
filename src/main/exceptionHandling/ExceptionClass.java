package exceptionHandling;

public class ExceptionClass {
    public static void main(String[] args) {
        int a[] = new int[5];
//        try{
//            int result = 5/0;
//            System.out.println(a[8]);
//
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Tried to access the out ob bound element");
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }

        try {
            int result = 5 / 0;
            System.out.println(a[8]);

//        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
//            System.out.println("handling the Exception");
//        }
        }catch(Exception e){
            System.out.println("handled Exception");
        }
        System.out.println("Hello guys");
    }
}
