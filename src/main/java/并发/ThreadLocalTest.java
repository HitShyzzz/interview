package 并发;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/20:51
 * @Description:
 */
public class ThreadLocalTest {
    public  static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void print(String s) {
        System.out.println(s + " : " + threadLocal.get());
        threadLocal.remove();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("shy1");
                print("thread1");
                System.out.println("after remove :" + threadLocal.get());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("shy2");
                print("thread2");
                System.out.println("after remove :" + threadLocal.get());
            }
        });
        t1.start();
        t2.start();
    }
}
