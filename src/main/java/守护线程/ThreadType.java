package 守护线程;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/19:58
 * @Description:
 */
public class ThreadType {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 50, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
        executor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("ThreadPool 线程类型：" + (Thread.currentThread().isDaemon() ? "守护线程" : "用户线程"));
            }
        });
        System.out.println("thread 线程类型：" + (thread.isDaemon() ? "守护线程" : "用户线程"));
        System.out.println("main 线程类型：" + (Thread.currentThread().isDaemon() ? "守护线程" : "用户线程"));
        thread.setDaemon(true);
        System.out.println("thread 线程类型：" + (thread.isDaemon() ? "守护线程" : "用户线程"));
    }
}
