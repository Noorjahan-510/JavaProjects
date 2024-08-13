package oops4;

public class ExampleAbstract {
    public static void main(String[] args) {
    A a =  new B();
    a.speak();

    }
}
abstract class A{
    abstract void speak();
}
class B extends A{

    @Override
    void speak() {
        System.out.println("B is speaking");
    }
}
