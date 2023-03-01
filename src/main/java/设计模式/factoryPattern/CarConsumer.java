package 设计模式.factoryPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/10:31
 * @Description:
 */
public class CarConsumer {
    public static void main(String[] args) {
        CarFactory factory=new CarFactory();
        Car bmw = factory.getCar("BMW");
        bmw.brand();
        Car byd = factory.getCar("BYD");
        byd.brand();
        Car w = factory.getCar("W");
        w.brand();
    }
}
