package Collection_List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//单列集合list
// list是接口，没有实例化，因此要创建一个它的子类
/* 1，创建集合对象
   2. 创建元素对象
   3，将元素对象添加到集合对象中
   4，遍历集合
* */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();

        Student s1 = new Student("张三",13);
        Student s2 = new Student("李四",16);
        Student s3 = new Student("老王",26);
        Student s4 = new Student("老周",19);
//
        list.add(s1);//把数据放进集合中
        list.add(s2);
        list.add(s3);
        list.add(s4);


//
//        System.out.println(list);
//        Object o = list.get(2);
//        System.out.println(o);
//        //获取索引为2的元素
//
//        System.out.println(list.size());
//
//        //增强for循环，就是迭代器的使用
//        for (Object o1 : list) {
//
//            System.out.println(o1);
//        }

        //通过迭代器遍历集合，
          Iterator it =list.iterator();
          while(it.hasNext()){
               Object o1 = it.next();
              System.out.println(o1);
          }
    }
}
