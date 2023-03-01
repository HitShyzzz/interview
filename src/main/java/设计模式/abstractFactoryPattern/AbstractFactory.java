package 设计模式.abstractFactoryPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/10:47
 * @Description:
 */
public abstract class AbstractFactory {
    public abstract Car getCar(String car);
    public abstract Color getColor(String color);
}
