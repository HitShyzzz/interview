package lamadaExpression;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/15:24
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args) {
        PrintCharAandB print = new PrintCharAandB();
        while (true) {
            new Thread(() -> {
                print.PrintA();
            }).start();
            new Thread(() -> {
                print.PrintB();
            }).start();
        }
    }
}
