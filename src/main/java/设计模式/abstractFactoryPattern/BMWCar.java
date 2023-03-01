package 设计模式.abstractFactoryPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/10:44
 * @Description:
 */
public class BMWCar implements Car{
    @Override
    public void brand() {
        System.out.println("宝马车");
    }
}
