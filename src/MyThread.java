import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.SwingTerminal;

public class MyThread extends Thread {

    private Background background;
    private Player player;

    public MyThread(Background background) {
        this.background = background;
    }

    public MyThread(Player player) {
        this.player = player;
    }



}


//    private List<Integer> threadList;
//    private Object lock;
//
//    MyThread(List<Integer> threadList, Object lock) {
//        this.threadList = threadList;
//        this.lock=lock;
//    }
//
//    @Override
//    public void run() {
//        int counter = 0;
//        while (true) {
//            try {
//                Thread.sleep(10);
//                counter++;
//                synchronized (lock) {
//                    threadList.set(0, counter); // set counter as the 1st element in the list
//                }
//            } catch (InterruptedException e) {}
//        }
//    }
//}
