package 守护线程;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/20:11
 * @Description:
 */
public class DemonThreadTest {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("i = "+i);
                }
            }
        });
        // setDaemon必须放在start（）方法前面，线程一旦执行就不能再设置守护线程了！
        thread.setDaemon(true);
        thread.start();
    }
}
