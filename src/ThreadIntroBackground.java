import com.googlecode.lanterna.terminal.Terminal;

import java.util.Random;

public class ThreadIntroBackground extends Thread {

    private Terminal terminal;
    private Object lock;

    public ThreadIntroBackground(Terminal terminal, Object lock) {

        this.terminal = terminal;
        this.lock = lock;
    }

    @Override
    public void run() {

        while (true) {

            try {
                synchronized (lock) {
                    Drawings.drawFromFile(terminal, "IntroStars1.txt", 0, 0);
                    Thread.sleep(300);
                    Drawings.cleanFromFile(terminal, "IntroStars1.txt", 0, 0);
                    Drawings.drawFromFile(terminal, "IntroStars2.txt", 0, 0);
                    Thread.sleep(300);
                    Drawings.cleanFromFile(terminal, "IntroStars2.txt", 0, 0);
                    Drawings.drawFromFile(terminal, "IntroStars3.txt", 0, 0);
                    Thread.sleep(300);
                    Drawings.cleanFromFile(terminal, "IntroStars3.txt", 0, 0);
                }
            } catch (Exception e) {
            }
        }
    }
}