package demo;

import java.util.ArrayList;

/**
 * @author huxiaomei
 * @date 2021/5/11 17:01
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(11);
        list.add("sjchbns");
        list.add(true);
        list.add(2948.18820);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("jdhf");
        //list1.add(293938); 泛型做类型的约束，使集合中的存放相同的数据类型
    }
}
