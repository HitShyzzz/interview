package 多线程;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/18:08
 * @Description:
 */
public class YieldTest extends Thread {
    public String name;

    public YieldTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("name:" + i);
            if (name.equals("t1") && i == 5) {
                System.out.println("t1的name:" + i + "yield......");
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new YieldTest("t1"));
        Thread t2 = new Thread(new YieldTest("t2"));
        t1.start();
        t2.start();
    }
}
