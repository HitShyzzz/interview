package 多态;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/03/20:36
 * @Description:
 */
public class Chinese extends People{
    @Override
    public void speak() {
        System.out.println("中国人说中国话");
    }
}
