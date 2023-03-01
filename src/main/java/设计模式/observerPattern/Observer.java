package 设计模式.observerPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/16:07
 * @Description:
 */
public abstract class Observer {
    protected Fire fire;
    public abstract void warning();
}
