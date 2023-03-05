package 并发;

import java.lang.ref.WeakReference;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/20:33
 * @Description:
 */
public class RefTest {
    public static void main(String[] args) {
        String s = new String("shy");
        WeakReference<String> weakReference = new WeakReference<>(s);
        s = null; // 切断强引用
        System.out.println(weakReference.get()); // shy
        System.gc();
        System.runFinalization();
        System.out.println(weakReference.get());// null
    }
}
