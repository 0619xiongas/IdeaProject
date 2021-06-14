package JavaBean_Obj;

import java.util.Objects;

//学生类
public class Student {
    private int id;
    private String name;
    private int score ;

    public Student(){
    }

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //toString方法

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    //equals方法
    public boolean equals1(Object obj)//s1.equals(s2)
    {
        /*
        该方法是非静态方法，因此存在“this”的使用
        this = s1,obj = s2;
        */
 /*       return this.id == obj.id;
        这条语句是错误的，多态，s2 是学生类，把s2赋给Obj类就是赋给父类，
        父类引用是不能引用子类的特有成员的。要强制转型*/

        Student s2 = (Student) obj;
        return this.id == ((Student) obj).id;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return id == student.id &&
                score == student.score &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }
}
