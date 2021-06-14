package Game;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //1 牌的组合
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A", "2"};
        String[] colors = {"♠", "♥", "♣", "♦"};
        int count = 0;
        //2 map双列组合
        Map<Integer, String> pokers = new HashMap<>();
        // 3 单列集合，存储牌的编号
        List<Integer> list = new ArrayList<>();
        for (String number : nums) {
            for (String color : colors) {
                String poker = color + number;
                pokers.put(count, poker);
                list.add(count);
                count++;
            }
        }
        pokers.put(count, "小王");
        list.add(count++);
        pokers.put(count, "大王");
        list.add(count);
        System.out.println("所有的牌：" + pokers);
        System.out.println("牌的编号： " + list);


        //洗牌：
        Collections.shuffle(list);
        System.out.println("洗好牌后的排序:" + list);


        // 发牌 :定义三个集合，将key对三取模
        List<Integer> play1 = new ArrayList<>();
        List<Integer> play2 = new ArrayList<>();
        List<Integer> play3 = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer pokerNum = list.get(i);
            if (i >= list.size() - 3) {
                dipai.add(pokerNum);
            } else if (i % 3 == 0) {
                play1.add(pokerNum);
            } else if (i % 3 == 1) {
                play2.add(pokerNum);
            } else if (i % 3 == 2) {
                play3.add(pokerNum);
            }
        }
        System.out.println("play1的牌：" + printPoker(play1, pokers));
        System.out.println("play1的牌：" + printPoker(play2,pokers));
        System.out.println("play1的牌：" + printPoker(play3,pokers));
        System.out.println("底牌为： "+ printPoker(dipai,pokers));
    }

    public static String printPoker(List<Integer> num, Map<Integer, String> pokers) {
        Collections.sort(num);
        StringBuilder sb = new StringBuilder();
        for (Integer data : num) {
            String poker = pokers.get(data);
            sb.append(poker + " ");
        }
        String str = sb.toString();
        return str.trim();
    }
}
