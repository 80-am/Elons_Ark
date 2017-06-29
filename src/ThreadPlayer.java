import com.googlecode.lanterna.terminal.Terminal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ThreadPlayer extends Thread {

    private Terminal terminal;
    private Object lock;
    private int xPos;
    private int yPos;

    public ThreadPlayer(Terminal terminal, Object lock) {

        this.terminal = terminal;
        this.lock = lock;

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