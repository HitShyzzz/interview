package 并发;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/06/21:07
 * @Description:
 */
public class SyncTest5 {
    public static void main(String[] args) {
        SyncThread syncThread1 = new SyncThread();
        SyncThread syncThread2 = new SyncThread();
        Thread thread1 = new Thread(syncThread1, "syncThread1");
        Thread thread2 = new Thread(syncThread2, "syncThread2");
        thread1.start();
        thread2.start();
    }

    static class SyncThread extends Thread {
        public void method() {
            synchronized (SyncThread.class) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("线程名：" + Thread.currentThread().getName() + ": " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                method();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
