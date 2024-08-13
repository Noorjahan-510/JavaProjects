package oops4;

public class LearnAnonymousClass {
    OuterClass obj = new OuterClass(){
        void sing(){

        }
        public void outerMethod(){

        }
    };     //anonymous class

    SuperInterface obj2= new SuperInterface() {
        @Override
        public void interfaceMethod() {

        }
    };         //anonymous interface

    SuperInterface obj3 = ()->{     //obj2 ==obj3, it's replced lengthy code with soimple

    };

    public static void main(String[] args) {
        Walkable walkable = (int steps)-> {
            System.out.println("walked "+steps+" steps");
            return steps;
        };
        walkable.walks(500);
        Walkable obj2 =(steps)-> 2*steps;    //
        System.out.println(obj2.walks(90));

    }


}
interface  Walkable{
    int walks(int steps);
}
class OuterClass{
    public void outerMethod(){

    }
}
@FunctionalInterface      //this is FunctionalInterface because only one method is inside this, if multiple methods were there it can't be functional Interface
interface SuperInterface{
    void interfaceMethod();


}
