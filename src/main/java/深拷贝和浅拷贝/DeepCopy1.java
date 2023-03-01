package 深拷贝和浅拷贝;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/22:01
 * @Description:
 */
public class DeepCopy1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Teacher1 teacher = new Teacher1();
        teacher.setName("zhangSan");
        teacher.setAge(34);
        Student2 student = new Student2();
        student.setName("lisi");
        student.setAge(18);
        student.setTeacher(teacher);
        Student2 student1 = (Student2) student.deepClone();
        System.out.println("拷贝后");
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getTeacher().getName());
        System.out.println(student1.getTeacher().getAge());
        System.out.println("修改老师的姓名");
        teacher.setName("wangwu");
        System.out.println(student.getTeacher().getName());
        System.out.println(student1.getTeacher().getName());
    }

}
