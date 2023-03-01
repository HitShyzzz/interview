package 设计模式.singleTon;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/27/21:49
 * @Description:
 */
public class SingleTonTest3 {
    private static SingleTonTest3 instance = new SingleTonTest3();

    private SingleTonTest3() {

    }

    public static SingleTonTest3 getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("hello,world!");
    }
}
