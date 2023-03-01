package 设计模式.producerComsumerPattern.firstMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/20:21
 * @Description:
 */
public class Resource {
    // 当前资源数量
    private int num = 0;
    // 资源池允许放的最大资源数量
    private int size = 10;

    // 消费资源
    public synchronized void consume() {
        if (num > 0) {
            num--;
            System.out.println("消费者" + Thread.currentThread().getName() + "正在消费资源，还剩" + num + "个资源");
            notifyAll();// 通知生产者生产资源
        } else {
            try {
                wait();// 阻塞消费者线程
                System.out.println("消费者" + Thread.currentThread().getName() + "正在阻塞等待");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 生产资源
    public synchronized void produce() {
        if (num < size) {
            num++;
            System.out.println("生产者" + Thread.currentThread().getName() + "正在生产资源，现有" + num + "个资源");
            notifyAll();// 通知消费者消费资源
        } else {
            try {
                wait();// 阻塞生产者线程
                System.out.println("生产者" + Thread.currentThread().getName() + "正在阻塞等待");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
