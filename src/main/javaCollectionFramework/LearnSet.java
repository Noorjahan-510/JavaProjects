package javaCollectionFramework;

import java.util.*;

class Student{
    int rollNo;
    String name;
    public Student(int rollNo, String name){
       this.rollNo = rollNo;
       this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class LearnSet {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student s1 = new Student(5,"Noori");
        Student s2 = new Student(5,"jahan");
        System.out.println(s1.equals(s2));
        set.add(new Student(1,"Noor"));
        set.add(new Student(2,"Sachin"));
        set.add(new Student(2,"Malak"));
        System.out.println(set);
//        Set<Integer> st = new HashSet<>();  // insert randomly   //0(1)
//        Set<Integer> st = new LinkedHashSet<>(); //insert elements in sequence  //0(n)
//        Set<Integer> st = new TreeSet<>();// insert elements in sorted form  //0(logn)
//
//        st.add(10);
//        st.add(10);//duplicate not allowed
//        st.add(50);
//        st.add(90);
//        st.add(20);
//
//        //st.remove(10);
//
//        st.remove(20);
//        System.out.println(st.contains(10));
//        System.out.println(st);
//
   }
}
