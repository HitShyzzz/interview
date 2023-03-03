package 多态;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/03/20:38
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        People people = new Chinese();
        people.speak();
        people = new American();
        people.speak();
    }
}
