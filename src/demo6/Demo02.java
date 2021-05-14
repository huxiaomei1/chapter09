package demo6;

/**
 * @author huxiaomei
 * @date 2021/5/13 11:36
 */
interface IMyConv<String>{
    String zhuanhuandaxie();
}
public class Demo02 {
    public static void main(String[] args) {
        //对象方法
        IMyConv<String> shili = "hello"::toUpperCase;
        System.out.println(shili.zhuanhuandaxie());
    }
}