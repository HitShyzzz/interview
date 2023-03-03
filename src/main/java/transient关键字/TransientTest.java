package transient关键字;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/02/22:36
 * @Description:
 */
public class TransientTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.setUserName("zhangsan");
        user.setPassword("12345");
        System.out.println("before serializable:");
        System.out.println("userName=" + user.getUserName());
        System.out.println("password=" + user.getPassword());
        // 序列化
        FileOutputStream outputStream = new FileOutputStream("F:/codes/user.txt");
        ObjectOutputStream stream = new ObjectOutputStream(outputStream);
        stream.writeObject(user);
        outputStream.flush();
        outputStream.close();
        // 反序列化
        // 在反序列化之前修改userName的值
        User.userName="lisi";
        FileInputStream fileInputStream = new FileInputStream("F:/codes/user.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        user = (User) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("after serializable:");
        System.out.println("userName=" + user.getUserName());
        System.out.println("password=" + user.getPassword());
    }
}
