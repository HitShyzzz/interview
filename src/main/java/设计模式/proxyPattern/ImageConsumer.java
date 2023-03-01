package 设计模式.proxyPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/15:33
 * @Description:
 */
public class ImageConsumer {
    public static void main(String[] args) {
        String fileName = "cxk.jpg";
        ProxyImage proxyImage = new ProxyImage(fileName);
        // 需要从磁盘中读取
        proxyImage.display();
        System.out.println();
        // 不再从磁盘中读取
        proxyImage.display();
    }
}
