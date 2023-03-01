package 设计模式.producerComsumerPattern.ThirdMethod;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/22:22
 * @Description:
 */
public class Resource3 {
    private BlockingQueue resourceQueue = new LinkedBlockingQueue(10);

    // 生产资源
    public void produce() {
        try {
            resourceQueue.put(1);
            System.out.println("生产者" + Thread.currentThread().getName() + "正在生产资源，" + "现在有" + resourceQueue.size() + "件资源");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // 消费资源
    public void consume() {
        try {
            resourceQueue.take();
            System.out.println("消费者" + Thread.currentThread().getName() + "正在消费资源，" + "现在有" + resourceQueue.size() + "件资源");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
