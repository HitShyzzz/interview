package 设计模式.observerPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/16:25
 * @Description:
 */
public class ThirdObserver extends Observer{
    public ThirdObserver(Fire fire){
        this.fire=fire;
        this.fire.attach(this);
    }
    @Override
    public void warning() {
        if (fire.getState()!=0){
            System.out.println("我是三楼的防火员，"+fire.getState()+"楼着火了！");
        }
    }
}
