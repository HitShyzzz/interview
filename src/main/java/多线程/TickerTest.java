package 多线程;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/05/18:21
 * @Description:
 */
public class TickerTest {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();
        Thread t1 = new Thread(myTicket);
        System.out.println(t1.getId());
        Thread t2 = new Thread(myTicket);
        System.out.println(t2.getId());
        System.out.println(t1 == t2);
        t1.start();
        t2.start();

    }

    static class MyTicket extends Thread {
        private int ticket = 10;

        @Override
        public void run() {
            while (true) {
                System.out.println("Ticket ticket= " + ticket--);
                if (ticket < 0) {
                    break;
                }
            }
        }
    }
}
