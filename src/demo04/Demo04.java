package demo04;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author huxiaomei
 * @date 2021/5/13 9:24
 */
public class Demo04 {

        public static void main(String[] args) {
            Person person1 = new Person("Yixing","Zhang",25);
            Person person2 = new Person("Yanggui","Li",30);
            Person person3 = new Person("Chao","Ma",29);
            Person[]persons = {person1,person2,person3};
            List<Person> guiltyPersons = Arrays.asList(persons);
            //调用检查和执行的方法
            checkAndExecutor(guiltyPersons,
                    p->p.getLastName().startsWith("L"),
                    p-> System.out.println(p.getFirstName())
            );
        }

    private static void checkAndExecutor(List<Person>personList,
                                         Predicate<Person> predicate,
                                         Consumer<Person>consumer) {
            /*for (Person p : personList){
                if (nameChecker.check(p)){
                    excutor.execute(p);
                }
            }*/
       /*personList.forEach(
                p->{
                    if (predicate.test(p))
                        consumer.accept(p);
                }
        );*/
       /* personList.stream()
                .filter(p->p.getLastName().startsWith("Z"))
                .forEach(p-> System.out.println(p.getFirstName()));

        */
        personList.stream()
                .filter(p->p.getLastName().startsWith("Z"))
                .forEach(System.out::println);
    }


}
