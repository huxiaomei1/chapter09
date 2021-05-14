package demo6;

/**
 * @author huxiaomei
 * @date 2021/5/13 15:00
 *
 */
@FunctionalInterface
    interface IMyPerson<R ,PX,PN,PA>{
        R message (PN name,PX xing,PA age);
    }
    public class Demo04 {
        public static void main(String[] args) {
            IMyPerson<Person,String,String,Integer>shili = Person::new;
            Person str = shili.message("三","张",18);
            System.out.println(str);
        }
    }

