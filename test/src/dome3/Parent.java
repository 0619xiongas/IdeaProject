package dome3;
//定义一个父类

public class Parent {
    private String name;

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public Parent() {
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
