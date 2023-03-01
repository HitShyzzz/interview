package 设计模式.producerComsumerPattern.fourthMethod;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/22:55
 * @Description:
 */
// 消息中间件的底层原理
public class SourceQueue {
    private volatile boolean flag = true;// 默认开启进行生产和消费
    private AtomicInteger atomicInteger = new AtomicInteger();
    BlockingQueue<String> blockingQueue = null;

    public SourceQueue(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
        System.out.println("当前传入的阻塞队列是：" + blockingQueue.getClass().getName());
    }

    // 生产线程
    public void product() throws InterruptedException {
        String data = null;
        boolean offer;
        while (flag) {
            data = atomicInteger.incrementAndGet() + "";
            offer = blockingQueue.offer(data, 2L, TimeUnit.SECONDS);
            if (offer) {
                Thread.currentThread().setName("producer");
                System.out.println("生产者" + Thread.currentThread().getName() + "插入数据data" + data + "成功");
            } else {
                System.out.println("生产者" + Thread.currentThread().getName() + "插入数据data" + data + "失败");
            }
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("生产者" + Thread.currentThread().getName() + "停止生产，flag=" + flag + ",生产动作结束");
    }

    // 消费线程
    public void consume() throws InterruptedException {
        String result = null;
        while (flag) {
            result = blockingQueue.poll(2L, TimeUnit.SECONDS);
            if (result == null || result.equalsIgnoreCase("")) {
                flag = false;
                Thread.currentThread().setName("consumer");
                System.out.println("消费者" + Thread.currentThread().getName() + "超过2秒没有取出，消费结束");
                System.out.println();
                return;
            }
            Thread.currentThread().setName("consumer");
            System.out.println("消费者" + Thread.currentThread().getName() + "取出result=" + result);
        }
    }

    public void stop() {
        this.flag = false;
    }
}
