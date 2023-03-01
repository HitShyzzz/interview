package 设计模式.abstractFactoryPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/10:51
 * @Description:
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Car getCar(String car) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color==null){
            return null;
        }
        if (color.equalsIgnoreCase("red")){
            return new Red();
        }
        if (color.equalsIgnoreCase("blue")){
            return new Blue();
        }
        return null;
    }
}
