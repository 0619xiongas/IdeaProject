package Test;

import java.io.*;

public class Student implements Serializable {
    private int age;
    private  String name;
    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }
}
