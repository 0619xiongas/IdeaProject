package demo3;

//多态里面成员变量的使用、编译看左，运行看左
public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal.name);
        Dog dog = new Dog();
        System.out.println(dog.name);
        if(  animal instanceof Dog  ){
            System.out.println("ok!!!");
        }

    }
}
//结论，成员变量是不能被重写的