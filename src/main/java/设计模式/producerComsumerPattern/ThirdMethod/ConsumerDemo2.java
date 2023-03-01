package 设计模式.producerComsumerPattern.ThirdMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/22:35
 * @Description:
 */
public class ConsumerDemo2 {
    public static void main(String[] args) {
        Resource3 resource3 = new Resource3();
        ProducerThread2 producerThread1 = new ProducerThread2(resource3);
        ConsumerThread2 consumerThread1 = new ConsumerThread2(resource3);
        ConsumerThread2 consumerThread2 = new ConsumerThread2(resource3);
        ConsumerThread2 consumerThread3 = new ConsumerThread2(resource3);
        producerThread1.start();
        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();
    }
}
