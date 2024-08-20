package genericsAndWrapperClasses;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer obj = new Integer(12);
        Integer obj1 = Integer.valueOf("12");    //converted in int type

        System.out.println(2*obj1);
        Integer obj2 =12;// Autoboxing

        int age = obj; //unboxing

        //ArrayList<>=new ArrayList<>();

    }
}
