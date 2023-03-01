package 设计模式.observerPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/16:19
 * @Description:
 */
public class SecondObserver extends Observer{
    public SecondObserver(Fire fire){
        this.fire=fire;
        this.fire.attach(this);
    }
    @Override
    public void warning() {
        if (fire.getState()!=0){
            System.out.println("我是二楼的防火员，"+fire.getState()+"楼着火了!");
        }
    }
}
