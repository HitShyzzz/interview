package 设计模式.producerComsumerPattern.firstMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/20:33
 * @Description:
 */
public class Consumer extends Thread {
    private Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // 先生产一会再消费
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resource.consume();
        }
    }
}
