package reflect.test;

public class Student {
    //公共的无参构造
    public Student() {

    }

    //公共的带参构造
    public Student(String name){
        System.out.println("你录入的name的值是: "+name);
    }

    //私有的带参构造
    private Student(int age){
        System.out.println("你录入的age的值是: "+age);
    }
}
