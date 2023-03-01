package 多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/15:00
 * @Description:
 */
public class Await_Signal_Example {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Thread_await_signal thread_await_signal = new Thread_await_signal();
        executorService.execute(thread_await_signal::after);
        executorService.execute(thread_await_signal::before);
    }

}
