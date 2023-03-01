package 设计模式.singleTon;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/27/21:46
 * @Description:
 */
public class SingleTonDemo {
    public static void main(String[] args) {
        SingleTonTest1 singleTonTest1 = SingleTonTest1.getInstance();
        singleTonTest1.showMessage();
        SingleTonTest3 singleTonTest3 = SingleTonTest3.getInstance();
        singleTonTest3.showMessage();
    }
}
