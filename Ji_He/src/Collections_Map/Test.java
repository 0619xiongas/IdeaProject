package Collections_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //1 创建合集

        Map<Integer,Student> map = new HashMap<>();
        // 2 创建元素
        Student stu1 = new Student("zzz",16);
        Student stu2 = new Student("zz1",26);
        Student stu3 = new Student("zz2",36);

        // 3 把元素添加到集合中
        // put 第一次添加返回null，重复添加，新值会覆盖旧值，并返回旧值
        map.put(1,stu1);
        map.put(2,stu2);
        map.put(3,stu3);
        System.out.println(map);
        // 4 遍历集合
        //双列集合要转换成单列集合 1，获取所有key的集合   KeySet();    2,遍历所有key，，获每一个key   迭代器或者增强for语句  3，根据key值，获取指定的值 get（）

        //迭代器输出：
        Set<Integer> keys = map.keySet();

        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            Student value = map.get(key);
            System.out.println("key:"+key+" value:"+value);
        }

        System.out.println("增强for输出：");
        Set<Integer> key = map.keySet();
        for (Integer i:key) {
            Student va = map.get(i);
            System.out.println("key:"+i+" value:"+va);
        }
    }
}
