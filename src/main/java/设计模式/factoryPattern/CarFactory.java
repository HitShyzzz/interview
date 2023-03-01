package 设计模式.factoryPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/10:28
 * @Description:
 */
public class CarFactory {
    public Car getCar(String car){
        if (car==null){
            return null;
        }
        if (car.equalsIgnoreCase("BMW")){
            return new BMWCar();
        }
        if (car.equalsIgnoreCase("BYD")){
            return new BYDCar();
        }
        if (car.equalsIgnoreCase("W")){
            return new WCar();
        }
        return null;
    }
}
