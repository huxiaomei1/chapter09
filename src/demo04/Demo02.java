package demo04;

/**
 * @author huxiaomei
 * @date 2021/5/13 9:04
 */
@FunctionalInterface
interface IMessage{
    public void print();
}
public class Demo02 {
    public static void main(String[] args) {
        IMessage message = () -> {
            System.out.println("haha");
            System.out.println("wioe");
            System.out.println("jxmcnkmx");
        };
        message.print();
    }
}
