package 设计模式.producerComsumerPattern.secondMethod;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/22:07
 * @Description:
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition consumerCondition = lock.newCondition();
        Condition producerCondition = lock.newCondition();
        Resource2 resource2 = new Resource2(lock, consumerCondition, producerCondition);
        ProducerThread producerThread1 = new ProducerThread(resource2);
        ProducerThread producerThread2 = new ProducerThread(resource2);
        ProducerThread producerThread3 = new ProducerThread(resource2);
        ConsumerThread consumerThread1 = new ConsumerThread(resource2);
        ConsumerThread consumerThread2 = new ConsumerThread(resource2);
        ConsumerThread consumerThread3 = new ConsumerThread(resource2);
        producerThread1.start();
        producerThread2.start();
        producerThread3.start();
        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();
    }
}
