package 设计模式.producerComsumerPattern.secondMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/22:05
 * @Description:
 */
public class ProducerThread extends Thread {
    private Resource2 resource2;

    public ProducerThread(Resource2 resource2) {
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resource2.add();
        }
    }
}
