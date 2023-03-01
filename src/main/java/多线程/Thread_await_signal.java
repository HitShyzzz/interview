package 多线程;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/14:56
 * @Description:
 */
public class Thread_await_signal {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void before() {
        try {
            lock.lock();
            System.out.println("before func");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void after() {
        try {
            lock.lock();
            try {
                condition.await();
                System.out.println("after func");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } finally {
            lock.unlock();
        }
    }
}
