package ComparableAndComparator;

import java.util.TreeSet;

class Student implements Comparable<Student>{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Sorting on the basis of age
    public int compareTo(Student s){
        return Integer.compare(this.age,s.age);
    }

    public String toString(){
        return name + " " + age;
    }
}


public class TreeSetUsingComparable {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student("Aryan",20));
        set.add(new Student("Misty",19));
        set.add(new Student("Paras",20));

        for(Student s : set){
            System.out.println(s);
        }
    }
}
