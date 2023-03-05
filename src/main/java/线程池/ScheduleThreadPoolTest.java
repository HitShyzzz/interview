package 线程池;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/22:53
 * @Description:
 */
public class ScheduleThreadPoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(10);
        Runnable task=new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务啦");
            }
        };
        threadPool.schedule(task,1, TimeUnit.SECONDS);
        threadPool.scheduleAtFixedRate(task,1,10,TimeUnit.SECONDS);
    }
}
