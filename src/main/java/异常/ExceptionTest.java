package 异常;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/8:50
 * @Description:
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        try {
            int res = div(a, b);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("我是finally，必须执行");
        }

    }

    public static int div(int a, int b) {
        int result = 0;
        if (b == 0) {
            throw new RuntimeException("除数不能为0");
        }
        result = a / b;
        return result;
    }
}
