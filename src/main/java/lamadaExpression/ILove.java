package lamadaExpression;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/15:15
 * @Description:
 */
public class ILove implements Love{
    @Override
    public void love(int i) {
        System.out.println("i love you,"+i);
    }
}
