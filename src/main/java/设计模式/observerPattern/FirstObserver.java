package 设计模式.observerPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/16:12
 * @Description:
 */
public class FirstObserver extends Observer{
    public FirstObserver(Fire fire){
        this.fire=fire;
        this.fire.attach(this);
    }
    @Override
    public void warning() {
        if (fire.getState()!=0){
            System.out.println("我是一楼的防火员，"+fire.getState()+"楼着火了！");
        }
    }
}
