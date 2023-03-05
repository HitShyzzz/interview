package 线程池;




/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/22:25
 * @Description:
 */
public class ThreadFactoryDemo {
    public static void main(String[] args) {
        ThreadFactoryTest shy = new ThreadFactoryTest("shy");
        Thread thread = shy.newThread(new Runnable() {
            @Override
            public void run() {

            }
        });
        thread.start();
    }
}
