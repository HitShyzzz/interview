package 设计模式.singleTon;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/27/21:55
 * @Description:
 */
public class SingleTonTest4 {
    private volatile static SingleTonTest4 instance;

    private SingleTonTest4() {

    }

    public static SingleTonTest4 getInstance() {
        if (instance == null) {
            synchronized (SingleTonTest4.class) {
                if (instance == null) {
                    instance = new SingleTonTest4();
                }
            }
        }
        return instance;
    }
}
