import com.googlecode.lanterna.terminal.Terminal;

import java.util.Random;

public class ThreadBackground extends Thread {

    private Terminal terminal;
    private Object lock;

    public ThreadBackground(Terminal terminal, Object lock) {

        this.terminal = terminal;
        this.lock = lock;
    }

    @Override
    public void run() {

        Background stars;

        synchronized (lock) {

            stars = new Background(terminal);

        }

        while (true) {

            try {
                synchronized (lock) {
                    terminal.clearScreen();
                    stars.addStars();
                }
                Thread.sleep(400);
            } catch (InterruptedException e) {
            }
        }
    }
}