package 设计模式.producerComsumerPattern.firstMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/20:36
 * @Description:
 */
public class Producer extends Thread {
    private Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // 先消费一会儿再生产
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resource.produce();
        }
    }
}
