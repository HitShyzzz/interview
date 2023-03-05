package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/23:00
 * @Description:
 */
public class CacheThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务啦！");
            }
        };
        threadPool.execute(task);
    }
}
