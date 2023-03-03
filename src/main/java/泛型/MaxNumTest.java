package 泛型;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/03/21:04
 * @Description:
 */
public class MaxNumTest {
    public static <T extends Comparable<T>> T maxNum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(x) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 6;
        Integer c = 3;
        System.out.printf("%d,%d,%d中最大的数是：%d", a, b, c, maxNum(a, b, c));
        System.out.println();
        Float x = 1.2f;
        Float y = 0.1f;
        Float z = 9.0f;
        System.out.printf("%.2f,%.2f,%.2f中最大的数是：%.2f", x, y, z, maxNum(x, y, z));
    }
}
