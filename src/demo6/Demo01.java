package demo6;

/**
 * @author huxiaomei
 * @date 2021/5/13 11:19
 */
interface int2String<P,R>{
    R zhuanhuan(P zhengshu);
}
public class Demo01 {
    public static void main(String[] args) {
        //zhengshu -> zhengshu+"" 直接引用jdk中写好的代码 String::valveof
        //int2String<Integer,String> shili = zhengshu -> zhengshu+"";
        int2String<Integer,String> shili = String::valueOf;
        String str = shili.zhuanhuan(999);
        System.out.println(str.length());
    }

}
