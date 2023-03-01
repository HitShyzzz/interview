/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/10:48
 * @Description:
 */
public interface Nation {
    public static final String home="EARTH";
    public abstract void nation();
    public default void language(){
        System.out.println("每个国家都有自己的语言");
    }
    public default void culture(){
        System.out.println("每个国家都有自己的文化");
    }

    public static void food(){
        System.out.println("每个国家都有自己的食物");
    }
}
