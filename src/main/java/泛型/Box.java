package 泛型;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/03/21:19
 * @Description:
 */
public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.add(new Integer(100));
        int a = integerBox.get();
        System.out.println(a);
        Box<String> stringBox = new Box<>();
        stringBox.add(new String("hello world"));
        String b = stringBox.get();
        System.out.println(b);
    }
}
