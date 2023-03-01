package 设计模式.factoryPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/10:28
 * @Description:
 */
public class WCar implements Car{
    @Override
    public void brand() {
        System.out.println("大众车");
    }
}
