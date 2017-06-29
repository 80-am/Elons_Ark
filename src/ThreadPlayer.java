import com.googlecode.lanterna.terminal.Terminal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ThreadPlayer extends Thread {

    private Terminal terminal;
    private Object lock;
    private int xPos;
    private int yPos;

    public ThreadPlayer(Terminal terminal, Object lock, int xPos, int yPos) {

        this.terminal = terminal;
        this.lock = lock;
        this.xPos = xPos;
        this.yPos = yPos;

    }

    @Override
    public void run() {

        try {
            synchronized (lock) {
                Drawings.drawFromFile(terminal, "Ship.txt", xPos, yPos);
            }
        } catch (Exception e) {
        }


    }
}