package dome1;

public class Student {

    public Student(){}

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
     private String name;

     private int age;

     public void setAge(int age){
         this.age = age;
    }

    public int getAge(){
         return age;
    }

    public void setName(String name){
         this.name = name;
    }

    public String getName() {
         return name;
    }

    public void study(){
        System.out.println(name + "正在努力学习。。。");
    }
}
