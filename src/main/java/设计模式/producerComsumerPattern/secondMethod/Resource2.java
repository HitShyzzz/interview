package 设计模式.producerComsumerPattern.secondMethod;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/21:47
 * @Description:
 */
public class Resource2 {
    private int num = 0;// 当前资源数量
    private int size = 10;// 允许最大资源数量
    private Lock lock;
    private Condition consumerCondition;
    private Condition producerCondition;

    public Resource2(Lock lock, Condition consumerCondition, Condition producerCondition) {
        this.lock = lock;
        this.consumerCondition = consumerCondition;
        this.producerCondition = producerCondition;
    }

    // 添加资源
    public void add() {
        lock.lock();
        try {
            if (num < size) {
                num++;
                System.out.println("生产者" + Thread.currentThread().getName() + "正在生产资源，现有" + num + "件资源");
                consumerCondition.signalAll();// 唤醒消费者线程去消费
            } else {
                try {
                    producerCondition.await(); // 生产者线程开始阻塞
                    System.out.println("生产者" + Thread.currentThread().getName() + "正在阻塞");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } finally {
            lock.unlock();
        }
    }

    // 消费资源
    public void consume() {
        lock.lock();
        try {
            if (num > 0) {
                num--;
                System.out.println("消费者" + Thread.currentThread().getName() + "正在消费资源，还剩" + num + "件资源");
                producerCondition.signalAll();// 唤醒生产者线程来生产
            } else {
                try {
                    consumerCondition.await();// 阻塞消费者线程
                    System.out.println("消费者" + Thread.currentThread().getName() + "正在阻塞");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } finally {
            lock.unlock();
        }
    }

}
