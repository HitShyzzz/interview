package 线程池;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/23:03
 * @Description:
 */
public class SingleThreadPoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService threadPool = Executors.newSingleThreadScheduledExecutor();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务啦！");
            }
        };
        threadPool.execute(task);
    }
}
