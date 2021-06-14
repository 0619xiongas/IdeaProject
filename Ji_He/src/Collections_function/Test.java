package Collections_function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1 max方法
2 sort方法
3 reverse方法
4 shuffle方法
*/
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(3);

        System.out.println("没有操作以前，集合的数据为：" + list);
        //max 方法
        int max = Collections.max(list);
        System.out.println("集合中的最大元素"+max);
        //对集合进行升序排列
        Collections.sort(list);
        System.out.println("排序后的集合"+list);

        //反转集合元素
        Collections.reverse(list);
        System.out.println("集合元素反转后：" +list);

        //随机置换shuffle
        Collections.shuffle(list);
        System.out.println(list);
    }
}
