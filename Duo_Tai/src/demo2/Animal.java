package demo2;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }


    //构造方法
    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("吃饭");
    }
}
