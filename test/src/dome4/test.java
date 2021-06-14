package dome4;

import dome3.Parent;

public class test {
    public static void main(String[] args){
        Dog d = new Dog();
        d.setName("哈士奇");
        d.eat();
        d.watch();
        System.out.println("------------");


        Pig p = new Pig();
        p.setName("小猪佩奇");
        p.eat();
        p.snore();
        System.out.println("---------------");
    }
}
