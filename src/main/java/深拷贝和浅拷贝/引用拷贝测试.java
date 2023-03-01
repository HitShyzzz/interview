package 深拷贝和浅拷贝;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/17:36
 * @Description:
 */
public class 引用拷贝测试 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher1 = new Teacher("zhangSan", 34);
        Teacher teacher2 = teacher1;
        System.out.println(teacher1);
        System.out.println(teacher2);
        Teacher teacher3 = (Teacher) teacher1.clone();
        System.out.println(teacher3);
    }
}
