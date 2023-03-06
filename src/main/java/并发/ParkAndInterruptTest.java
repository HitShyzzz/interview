package 并发;

import sun.misc.Unsafe;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/06/18:57
 * @Description:
 */
public class ParkAndInterruptTest implements Runnable {
    public static void main(String[] args) {
        new Thread(new ParkAndInterruptTest(), "shy").start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            Thread.interrupted();
//            Unsafe unsafe = new Unsafe();
//            unsafe.park(false, 1);
            System.out.println("thread name: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
