package 并发;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/06/19:57
 * @Description:
 */
public class CyclicVBarrierTest {
    public static void main(String[] args) {
        int N = 4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N, new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程" + Thread.currentThread().getName());
            }
        });
        for (int i = 0; i < N; i++) {
            new Thread(new writer(cyclicBarrier)).start();
        }
    }


    static class writer extends Thread {
        private CyclicBarrier cyclicBarrier;

        public writer(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println("线程" + Thread.currentThread().getName() + "正在写数据");
            try {
                Thread.sleep(3000);
                System.out.println("线程" + Thread.currentThread().getName() + "写入数据完毕，等待其他线程执行。。。");
                try {
                    cyclicBarrier.await();
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("所有线程执行完毕，继续执行其他任务。。。");
        }
    }
}
