package 深拷贝和浅拷贝;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/21:40
 * @Description:
 */
public class Student2 implements Serializable {
    private String name;
    private int age;
    private Teacher1 teacher1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher1 getTeacher() {
        return teacher1;
    }

    public void setTeacher(Teacher1 teacher1) {
        this.teacher1 = teacher1;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        // 序列化
        ByteArrayOutputStream byteArrayInputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayInputStream);
        outputStream.writeObject(this);
        // 反序列化
        ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArrayInputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        return objectInputStream.readObject();
    }
}
