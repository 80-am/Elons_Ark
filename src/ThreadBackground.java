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

        while (true) {

            try {
                synchronized (lock) {
                    Drawings.drawFromFile(terminal, "Stars1.txt", 0, 0);
                    Thread.sleep(400);
                    Drawings.cleanFromFile(terminal, "Stars1.txt", 0, 0);
                    Drawings.drawFromFile(terminal, "Stars2.txt", 0, 0);
                    Thread.sleep(400);
                    Drawings.cleanFromFile(terminal, "Stars2.txt", 0, 0);
                    Drawings.drawFromFile(terminal, "Stars3.txt", 0, 0);
                    Thread.sleep(400);
                    Drawings.cleanFromFile(terminal, "Stars3.txt", 0, 0);
                }
            } catch (Exception e) {
            }
        }
    }
}


//        while (true) {
//
//            try {
//                synchronized (lock) {
//                    terminal.clearScreen(); //replace with removeStars
//                    stars.addStars();
//                }
//                Thread.sleep(400);
//            } catch (InterruptedException e) {
//            }
//