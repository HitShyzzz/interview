package 线程池;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/22:21
 * @Description:
 */
public class ThreadFactoryTest implements ThreadFactory {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private String prefix;

    public ThreadFactoryTest(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = newThread(r);
        while (atomicInteger.get() < 5) {
            thread.setName(prefix + atomicInteger.getAndIncrement());
        }
        return thread;
    }
}
