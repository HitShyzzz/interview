package lamadaExpression;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/15:16
 * @Description:
 */
public class LoveTest {
    public static void main(String[] args) {
        Love love = new ILove();
        love.love(1);
        love = (int a) -> {
            System.out.println("i love you," + a);
        };
        love.love(520);
        love = (a) -> {
            System.out.println("i love you," + a);
        };
        love.love(1314);

    }
}
