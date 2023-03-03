package transient关键字;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/02/23:04
 * @Description:
 */
public class ExterNalizableTest implements Externalizable {
    private transient String content = "love";

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(content);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        content = (String) in.readObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Externalizable externalizable = new ExterNalizableTest();
        // 序列化
        FileOutputStream outputStream = new FileOutputStream("F:/codes/test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(externalizable);
        objectOutputStream.flush();
        objectOutputStream.close();
        // 反序列化
        FileInputStream fileInputStream = new FileInputStream("F:/codes/test.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        ExterNalizableTest o = (ExterNalizableTest) inputStream.readObject();
        System.out.println(o.content);
        inputStream.close();
    }
}
