package 设计模式.singleTon;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/27/21:42
 * @Description:
 */
public class SingleTonTest2 {
    private static SingleTonTest2 instance=null;
    private SingleTonTest2(){

    }
    public static synchronized SingleTonTest2 getInstance(){
        if (instance==null){
            instance=new SingleTonTest2();
        }
        return instance;
    }
}
