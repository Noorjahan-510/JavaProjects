package oops1;

public class LearnConstructors {
    public static void main(String[] args) {
        Complex num1 = new Complex(2,4);
        num1.print();
        Complex num2 = new Complex(6);
        num2.print();
        System.out.println("adding two numers");
        Complex result= num1.add(num2);
        result.print();

    }
}
class Complex{
    int a, b;
    public Complex(int real){   //overriding default constructor
        a = real;
        b = 9;
    }

    public Complex(int real, int imaginary){
        a = real;
        b = imaginary;
    }
    void print(){
        System.out.println(a+"+"+b+"i");
    }
    Complex add(Complex num2){
        return new Complex(a+num2.a,b+num2.b);
    }
}
