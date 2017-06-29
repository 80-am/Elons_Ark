import com.googlecode.lanterna.terminal.Terminal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class ThreadFriends extends Thread {

    private Terminal terminal;
    private Object lock;
    private int friendXpos;
    private int friendYpos;

    public ThreadFriends (Terminal terminal, Object lock, int friendXpos, int friendYpos) {

        this.terminal = terminal;
        this.lock = lock;
        this.friendXpos = friendXpos;
        this.friendYpos = friendYpos;

    }

    @Override
    public void run() {


        try {
            synchronized (lock) {
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                Drawings.drawFromFile(terminal, "Mice.txt",friendXpos, friendYpos);
            }
        } catch (Exception e) {
        }
    }
}