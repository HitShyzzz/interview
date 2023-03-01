package 设计模式.producerComsumerPattern.ThirdMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/22:30
 * @Description:
 */
public class ProducerThread2 extends Thread {
    private Resource3 resource3;

    public ProducerThread2(Resource3 resource3) {
        this.resource3 = resource3;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // 阻塞让消费者消费
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resource3.produce();
        }
    }
}
