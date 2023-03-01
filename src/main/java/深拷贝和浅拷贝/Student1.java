package 深拷贝和浅拷贝;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/01/21:40
 * @Description:
 */
public class Student1 implements Cloneable {
    private String name;
    private int age;
    private Teacher teacher;

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // 深拷贝
        Student1 student1 = (Student1) super.clone();
        student1.setTeacher((Teacher) student1.getTeacher().clone());
        return student1;
    }
}
