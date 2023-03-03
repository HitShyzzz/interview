package 泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/03/21:36
 * @Description:
 */
public class SuperTest {
    public static void add(List<? super Chinese> list) {
        People people = new People();
        people.speak();
        // list.add(people);

        Chinese chinese = new Chinese();
        chinese.speak();
        list.add(chinese);
        Henanese henanese = new Henanese();
        henanese.speak();
        list.add(henanese);
        list.add(new SanMenXia());
    }

    public static void main(String[] args) {
        List<? super People> list = new ArrayList<>();
        // add(list);
    }

}
