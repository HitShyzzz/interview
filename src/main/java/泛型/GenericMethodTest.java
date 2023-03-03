package 泛型;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/03/20:53
 * @Description:
 */
public class GenericMethodTest {
    public static <E> void printArray(E[] inputArray) {
        for (E e : inputArray) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);
        Float[] floatArray = {0.1f, 0.2f, 3.0f};
        printArray(floatArray);
        Character[] charArray = {'a', 'b', 'v'};
        printArray(charArray);
    }
}
