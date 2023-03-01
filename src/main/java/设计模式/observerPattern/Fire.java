package 设计模式.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/02/28/16:07
 * @Description:
 */
public class Fire {
    private List<Observer> list = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        NotifyAllObservers();
    }

    public void NotifyAllObservers() {
        if (state != 0) {
            list.get(state - 1).warning();
            list.remove(state - 1);
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).warning();
        }
    }

    public void attach(Observer observer) {
        list.add(observer);
    }

}
