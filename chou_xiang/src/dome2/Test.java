package dome2;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();

        //抽象类的成员变量
        animal.name = "汤姆";
        System.out.println(animal.name);
       // animal.name = 50;
        System.out.println(animal.AGE);
    }
}
