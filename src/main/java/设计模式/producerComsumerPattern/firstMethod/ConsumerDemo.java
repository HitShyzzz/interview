package 设计模式.producerComsumerPattern.firstMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/20:39
 * @Description:
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Producer producer1 = new Producer(resource);
        Producer producer2 = new Producer(resource);
        Producer producer3 = new Producer(resource);
        Consumer consumer1 = new Consumer(resource);
        Consumer consumer2 = new Consumer(resource);
        Consumer consumer3 = new Consumer(resource);
        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
