package 设计模式.abstractFactoryPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/10:46
 * @Description:
 */
public class Red implements Color{
    @Override
    public void draw() {
        System.out.println("红色");
    }
}
