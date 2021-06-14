package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//set： 无序跟唯一
public class Test {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();


        Student stu1 = new Student("张三",26);
        Student stu2 = new Student("laowang",16);
        Student stu3 = new Student("laowang",16);
        Student stu4 = new Student("周",19);
        Student stu5 = new Student("唐",20);

        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        set.add(stu5);

        System.out.println(set);
        /*
        没有去重，set里面是依靠equals跟hashCode方法，但是在Student类中没有重写该方法，因此是默认的Object类中的方法
        而Object类中的equals方法是默认比较地址值的，因此要在Student类中重写
        * */

        System.out.println("迭代器输出set中数据: ");
        Iterator<Student> it = set.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }

        System.out.println("for增强输出：");
        for (Student stu: set) {
            System.out.println(stu);
        }
    }
}
