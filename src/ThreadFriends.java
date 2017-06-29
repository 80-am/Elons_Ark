import com.googlecode.lanterna.terminal.Terminal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class ThreadFriends extends Thread {

    private Terminal terminal;
    private Object lock;
    private int startX;
    private int startY;

    public ThreadFriends (Terminal terminal, Object lock) {

        this.terminal = terminal;
        this.lock = lock;

    }

    Random r = new Random();

    int x = r.nextInt(170)+20;

    @Override
    public void run() {


        try {
            synchronized (lock) {
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                Drawings.drawFromFile(terminal, "Mice.txt",x, 1);
            }
        } catch (Exception e) {
        }


    }
}