package 泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/03/21:30
 * @Description:
 */
public class Container {
    public static void getData(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        getData(list);
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        getData(list1);
    }
}
