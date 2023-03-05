package JVM调优;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/10:27
 * @Description:
 */
public class OrderTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("初始堆情况-----");
        Thread.sleep(250000);
        byte[]bytes=new byte[1024*1024*10];
        System.out.println("创建了对象之后堆的情况");
        Thread.sleep(250000);
        bytes=null;
        System.gc();
        System.out.println("垃圾回收后堆的情况");
        Thread.sleep(250000);
    }
}
