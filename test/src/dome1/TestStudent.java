package dome1;

import sun.rmi.runtime.Log;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);
        System.out.println(s.getName());
        System.out.println(s.getAge());

        System.out.println("----------------------------");

        Student s2 = new Student("jobs",23);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }
}
