package 异常;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/9:20
 * @Description:
 */
public class Demo {
    public static void main(String[] args) throws MyException {
        File file = new File("F:/codes/test.txt");
        if (file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new MyException("文件创建失败", e);
            }
        }

    }
}


class MyException extends Exception {
    public MyException(String msg, Throwable t) {
        super(msg, t);
    }
}
