package 设计模式.singleTon;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/27/22:05
 * @Description:
 */
public class SingleTonTest5 {
    private static class SingleTonHolder {
        private static final SingleTonTest5 INSTANCE = new SingleTonTest5();
    }

    private SingleTonTest5() {

    }

    public static final SingleTonTest5 getInstance() {
        return SingleTonHolder.INSTANCE;
    }

}
