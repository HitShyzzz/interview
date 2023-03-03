package transient关键字;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/02/22:35
 * @Description:
 */
public  class User implements Serializable {
    public static String userName;
    private transient String password;

    public  String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
