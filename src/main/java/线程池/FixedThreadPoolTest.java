package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/22:49
 * @Description:
 */
public class FixedThreadPoolTest {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            executor();
        }
    }
    public static void executor(){
        ExecutorService threadPool= Executors.newFixedThreadPool(10);
        Runnable task=new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务啦");
            }
        };
        threadPool.execute(task);
    }
}
