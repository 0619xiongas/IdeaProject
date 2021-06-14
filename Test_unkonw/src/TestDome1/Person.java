package TestDome1;

public class Person {
    private String name ;

    private int age;

    private String sex;

    public void setName(String name){
        if(name.length()>6 || name.length() <2){
            System.out.println("您设置的人名不符合要求");
            return ;
        }else {
            this.name = name;
        }
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if(age > 100 || age < 10){
            System.out.println("您设置的年龄不合法");
            return;
        }
        else {
            this.age = age;
        }
    }

    public int getAge(){
        return this.age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person(String name, int age, String sex) {
        this(name,sex);
        this.age = age;
    }
    public Person(){

    }
    public Person(String name,String sex){
        this.sex = sex;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
