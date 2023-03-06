package 并发;

import java.util.concurrent.CountDownLatch;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/06/19:24
 * @Description:
 */
public class CountDownLaunchTest {
    private static final CountDownLatch latch = new CountDownLatch(2);

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
                try {
                    Thread.sleep(3000);
                    System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
                    latch.countDown();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
                try {
                    Thread.sleep(3000);
                    System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
                    latch.countDown();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();

        System.out.println("等待子线程执行完毕");
        try {
            latch.await();
            System.out.println("子线程执行完毕");
            System.out.println("继续执行main线程");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
