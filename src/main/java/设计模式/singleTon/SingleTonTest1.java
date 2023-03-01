package 设计模式.singleTon;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/27/21:39
 * @Description:
 */
// 懒汉式
public class SingleTonTest1 {
    private static SingleTonTest1 instance = null;

    private SingleTonTest1() {

    }

    public static SingleTonTest1 getInstance() {
        if (instance == null) {
            instance = new SingleTonTest1();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("hello,world!");
    }
}
