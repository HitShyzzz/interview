package 设计模式.observerPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/16:27
 * @Description:
 */
public class FireTest {
    public static void main(String[] args) {
        Fire fire = new Fire();
        new FirstObserver(fire);
        new SecondObserver(fire);
        new ThirdObserver(fire);
        System.out.println("3楼着火了！");
        fire.setState(3);
    }
}
