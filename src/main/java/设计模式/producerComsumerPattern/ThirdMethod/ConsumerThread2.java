package 设计模式.producerComsumerPattern.ThirdMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/22:33
 * @Description:
 */
public class ConsumerThread2 extends Thread {
    private Resource3 resource3;

    public ConsumerThread2(Resource3 resource3) {
        this.resource3 = resource3;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // 阻塞先让生产者生产一会儿
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resource3.consume();
        }
    }
}
