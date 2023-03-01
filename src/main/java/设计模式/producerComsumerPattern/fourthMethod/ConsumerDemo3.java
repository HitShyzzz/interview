package 设计模式.producerComsumerPattern.fourthMethod;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/23:13
 * @Description:
 */
public class ConsumerDemo3 {
    public static void main(String[] args) throws InterruptedException {
//        SourceQueue sourceQueue = new SourceQueue(new ArrayBlockingQueue<>(10));
//        Thread producerThread = new Thread();
//        producerThread.setName("producer");
//        System.out.println("生产者" + producerThread.getName() + "启动");
//        try {
//            sourceQueue.product();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        producerThread.start();
//        Thread consumerThread = new Thread();
//        consumerThread.setName("consumer");
//        System.out.println("消费者" + consumerThread.getName() + "启动");
//        try {
//            sourceQueue.consume();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        consumerThread.start();
//        TimeUnit.SECONDS.sleep(5);
//        System.out.println();
//        System.out.println(Thread.currentThread().getName() + "停止");
//        sourceQueue.stop();

        SourceQueue sourceQueue = new SourceQueue(new ArrayBlockingQueue<>(10));
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" 生产者线程启动");
            try {
                sourceQueue.product();
            } catch (Exception e) {
                e.printStackTrace();
            }

        },"Prod").start();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" 消费者线程启动");
            try {
                sourceQueue.consume();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"Consumer").start();

        TimeUnit.SECONDS.sleep(5);

        System.out.println();
        System.out.println(Thread.currentThread().getName()+" BOSS 停止");
        System.out.println();

        sourceQueue.stop();

    }
}
