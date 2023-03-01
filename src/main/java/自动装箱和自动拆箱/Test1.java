package 自动装箱和自动拆箱;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/16:24
 * @Description:
 */
public class Test1 {
    public static void main(String[] args) {
        String num = "666";
        // 封装成Integer再拆箱成int
        int intNum = Integer.valueOf(num);
        System.out.println("intNum=" + intNum);
        // 封装成Float再拆箱成float
        float floatNum = Float.valueOf(num);
        System.out.println("floatNum=" + floatNum);
        // 封装成Long再拆箱成long
        long longNum = Long.valueOf(num);
        System.out.println("longNum=" + longNum);

        Integer integer = new Integer(100);
        // 拆箱
        int i = integer.intValue();
        System.out.println(i);
    }
}
