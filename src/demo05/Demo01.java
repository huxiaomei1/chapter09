package demo05;

import java.util.Optional;

/**
 * @author huxiaomei
 * @date 2021/5/13 11:01
 */
public class Demo01 {
    public static void main(String[] args) {
        Person person = new Person("大柱子", "张", 28);
        Optional<Person> personOpt = Optional.ofNullable(person);
        personOpt.ifPresent(System.out::println);
        personOpt.orElse(null);
        //

        personOpt.map(p -> p.getLastName())
                .map(name -> name.toUpperCase())
                .orElse(null);
    }

}
