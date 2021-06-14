package demo1;

import java.util.Objects;

public class Animal {
    private String name;

    public Animal(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o instanceof Animal) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Animal(String name) {
        this.name = name;
    }
    //get set


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat (){
        System.out.println("吃饭");
    }
}
