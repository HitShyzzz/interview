package 设计模式.abstractFactoryPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/10:45
 * @Description:
 */
public class BYDCar implements Car{
    @Override
    public void brand() {
        System.out.println("比亚迪车");
    }
}
