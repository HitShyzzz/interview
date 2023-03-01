package 设计模式.abstractFactoryPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/10:55
 * @Description:
 */
public class AbstractFactoryConsumer {
    public static void main(String[] args) {
        AbstractFactory carFactory = FactoryProducer.getFactory("car");
        Car bmw = carFactory.getCar("bmw");
        bmw.brand();
        Car byd = carFactory.getCar("byd");
        byd.brand();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.getColor("red");
        red.draw();
        Color blue = colorFactory.getColor("BLUE");
        blue.draw();
    }
}
