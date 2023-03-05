package 多线程;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/17:56
 * @Description:
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("1111111111111111");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread1.join();
        // 必须等thread1执行完毕之后main线程才会执行
        System.out.println("2222222222222222");
    }
}
