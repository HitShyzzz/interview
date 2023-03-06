package 并发;

import sun.misc.Unsafe;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/06/18:30
 * @Description:
 */
public class ReentrantLockTest implements Runnable {
    private static ReentrantLock lock = new ReentrantLock();
    private int index;

    public ReentrantLockTest(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            lock.lock();
            System.out.println("lock thread name: " + Thread.currentThread().getName());
            System.out.print("write start");
            System.out.println();
            for (int i = 0; i < 15; i++) {
                Thread.sleep(100);
                System.out.print(index + ",");
            }
            System.out.println();
            System.out.println("write end");
            System.out.println("unlock thread name: " + Thread.currentThread().getName());
            lock.unlock();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        for (int i = 10; i < 15; i++) {
            new Thread(new ReentrantLockTest(i), "name-" + i).start();
        }
    }
}
