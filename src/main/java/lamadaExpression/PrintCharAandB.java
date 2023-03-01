package lamadaExpression;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/15:25
 * @Description:
 */
public class PrintCharAandB {
    private boolean flag = false;

    public synchronized void PrintA() {
        if (!flag) {
            System.out.println(Thread.currentThread().getName() + "正在打印字符A");
            flag = true;
            notifyAll();// A打印完唤醒B
        } else {
            try {
                wait();// B要打印A阻塞
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void PrintB() {
        if (flag) {
            System.out.println(Thread.currentThread().getName() + "正在打印字符B");
            flag = false;
            notifyAll();// 唤醒A
        } else {
            try {
                wait();// A打印B阻塞
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
