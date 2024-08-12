package oops3.learnPackage;

public class Teacher {
    public int classNo;
    String degree;    //default access modifier or package-private
    private int id;   // only this class can use this property

    protected int studentCount;

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.classNo=12;
        obj.id=123;
    }
}
