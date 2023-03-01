package 设计模式.proxyPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/15:25
 * @Description:
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("loading" + fileName);
    }

    @Override
    public void display() {
        System.out.println("displaying" + fileName);
    }
}
