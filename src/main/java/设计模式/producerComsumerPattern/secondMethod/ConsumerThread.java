package 设计模式.producerComsumerPattern.secondMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/22:00
 * @Description:
 */
public class ConsumerThread extends Thread {
    private Resource2 resource2;

    public ConsumerThread(Resource2 resource2) {
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // 阻塞一会让生产者去生产
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resource2.consume();
        }
    }
}
