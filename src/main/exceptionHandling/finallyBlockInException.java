package exceptionHandling;

public class finallyBlockInException {
    public static void main(String[] args) {
        int a[] = new int[5];

//        System.out.println("Hello word");

//        try{
//            System.out.println(a[8]);
//        }catch(Exception e){
//            System.out.println("Exception handled");
//        }finally {
//            System.out.println("I will run always");
//        }
//
//        System.out.println("Bye world!");
    try {
        getNoFromArray(a);
    }catch(Exception e){
        System.out.println("Exception caught " +e.getMessage());
    }
    }

    static int getNoFromArray(int a[]) throws ArithmeticException{
        return a[8];
    }
}
