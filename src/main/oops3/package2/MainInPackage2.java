package oops3.package2;

import oops3.learnPackage.Teacher;  // Teacher is in different package that's why we are importing

public class MainInPackage2 extends Teacher{
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.classNo=8;
      //  obj.degree="phd";   //degree is not public, so we can't use in outside of package

        MainInPackage2 obj2 = new MainInPackage2();
        obj2.studentCount = 40;     //studentCount is protected
    }
}
