package 深拷贝和浅拷贝;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/21:28
 * @Description:
 */
public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher();
        teacher.setName("zhangSan");
        teacher.setAge(34);
        Student student = new Student();
        student.setName("lisi");
        student.setAge(18);
        student.setTeacher(teacher);
        Student student1 = (Student) student.clone();
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
