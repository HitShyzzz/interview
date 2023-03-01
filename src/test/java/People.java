/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/10:41
 * @Description:
 */
public abstract class People {
    public int maxAge = 120;

    public abstract void walk();

    public People() {
    }

    public void eat() {
        System.out.println("人都会吃饭");
    }

}
