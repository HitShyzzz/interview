package 多态;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/03/20:37
 * @Description:
 */
public class American extends People{
    @Override
    public void speak() {
        System.out.println("美国人说美国话");
    }
}
