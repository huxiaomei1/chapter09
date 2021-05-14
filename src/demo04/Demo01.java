package demo04;

/**
 * @author huxiaomei
 * @date 2021/5/13 8:23
 */
@FunctionalInterface  //表明函数式编程
interface IMymessage3{
    void print();
}
public class Demo01 {
    public static void main(String[] args) {
        IMymessage3 mymessage3 = ()-> System.out.println("MyMessage");
        mymessage3.print();
    }
}
