package 深拷贝和浅拷贝;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/17:34
 * @Description:
 */
public class Teacher1 implements Serializable {
    String name;
    int age;
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
}
