package oops5AndJavaMemory;

class Data{
    int data;
    public void printData(){        //runtime polymorphism
        System.out.println(data);
    }

    public  void printData(int times){         //compile time
        for (int i = 0; i < times; i++) {
            System.out.println(data);
        }

    }

}

class childData extends Data{
    @Override                 //runtime polymorphism
    public void printData(){
        System.out.println("overridden "+data);
    }

    public void insideChildOnly(){

    }
}
public class LearnPolymorphism {
    public static void main(String[] args) {
        Data d = new childData();
       //d.insideChildOnly();
        d.printData();    //runtime polymorphism aka method overriding

        Data d2 = new childData();
        d2.printData(5);    //compile time polymorphism aka method overloading
//        int a = 5;
//        Data obj = new Data();
//        obj.data = 5;
//        changeValue(a,obj);
//        System.out.println(a);
//        System.out.println(obj.data);
    }

    static void changeValue(int a, Data obj){
        a = 10;
        obj.data = 100;
    }
}
