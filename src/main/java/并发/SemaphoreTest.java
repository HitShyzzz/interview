package 并发;

import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/06/19:38
 * @Description:
 */
public class SemaphoreTest {
    // 5台机器，8个工人，同一台机器每次只能让一个工人使用，一个工人使用完了之后，下一个工人才能使用
    public static void main(String[] args) {
        int N = 8;// 工人数量
        Semaphore semaphore = new Semaphore(5);// 机器数目
        for (int i = 0; i < N; i++) {
            new Thread(new Worker(i, semaphore)).start();
        }
    }

    static class Worker extends Thread {
        private int index;// 工人编号
        private Semaphore semaphore;

        public Worker(int index, Semaphore semaphore) {
            this.index = index;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("工人" + this.index + "正在使用机器");
                Thread.sleep(3000);
                System.out.println("工人" + this.index + "释放出一台机器");
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
