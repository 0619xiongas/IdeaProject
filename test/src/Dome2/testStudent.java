package Dome2;

public class testStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(23);
        s1.setName("张三");
        System.out.println(s1.getAge());
        System.out.println(s1.getName());


        Student s2 = new Student("韦小宝",40);
        System.out.println(s2.getAge());
        System.out.println(s2.getName());

    }
}
