package 自动装箱和自动拆箱;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/16:44
 * @Description:
 */
public class Test2 {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 128;
        Integer d = 128;
        System.out.println(a == b);// true
        System.out.println(c == d);// false
    }
}
