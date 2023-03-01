package 设计模式.abstractFactoryPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/10:49
 * @Description:
 */
public class CarFactory extends AbstractFactory{
    @Override
    public Car getCar(String car) {
        if (car==null){
            return null;
        }
        if (car.equalsIgnoreCase("bmw")){
            return new BMWCar();
        }
        if (car.equalsIgnoreCase("byd")){
            return new BYDCar();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
