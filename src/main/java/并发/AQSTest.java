package 并发;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/06/22:01
 * @Description:
 */
public class AQSTest extends AbstractQueuedSynchronizer {

    @Override
    protected boolean tryAcquire(int arg) {
        return super.compareAndSetState(0,1);
    }

    @Override
    protected boolean tryRelease(int arg) {
        return super.compareAndSetState(1,0);
    }


    public static void main(String[] args) {
        final AQSTest aqsTest=new AQSTest();
        new Thread(()->{
            System.out.println("thread1 acquire muteX");
            aqsTest.acquire(1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            aqsTest.release(1);
            System.out.println("thread1 release muteX");
        }).start();
        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            aqsTest.acquire(1);
            System.out.println("thread2 acquire muteX");
            aqsTest.release(1);
            System.out.println("thread2 release muteX");
        }).start();

    }
}
