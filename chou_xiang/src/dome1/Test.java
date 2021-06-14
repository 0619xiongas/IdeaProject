package dome1;


//抽象方法，只有方法申明，没有具体实现
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        Mouse mouse = new Mouse();
        mouse.eat();

        Animal animal1 = new Dog();
        animal1.eat();
    }
}
