package oops3.learnPackage;

public class Person {
    private int age;
    private String name;

    public static int count=0;

    public static final String scientificName = "Homo Sapiens";   // will never changed this value

    public Person(){
        count++;
    }
    boolean canBeChanged = true;
    public void setAge(int age){
        if(canBeChanged) {
            if(age>0) {
                this.age = age;
            }
        }
    }
    public int getAge(){
        return age;
    }
}
