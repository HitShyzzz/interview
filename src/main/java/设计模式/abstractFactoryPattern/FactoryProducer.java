package 设计模式.abstractFactoryPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/10:52
 * @Description:
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice==null){
            return null;
        }
        if (choice.equalsIgnoreCase("car")){
            return new CarFactory();
        }
        if (choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
