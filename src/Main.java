import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.SwingTerminal;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        Terminal terminal = new SwingTerminal(192, 60);
        terminal.enterPrivateMode();
        terminal.setCursorVisible(false);

        //creating lock
        Object lock = new Object();

        ThreadIntroBackground tib = new ThreadIntroBackground(terminal, lock);

        //writing StartScreen
        synchronized (lock) {
            Drawings.drawFromFile(terminal, "Intro.txt", 50, 25);
            tib.start();
        }

        boolean game = false;

        //wait for a key to be pressed
        Key key;
        do {
            Thread.sleep(5);
            key = terminal.readInput();
        }
        while (key == null);

        switch (key.getKind()) {
            case Enter:
                terminal.clearScreen();
                game = true;
                tib.stop();

                break;
            default:
                System.exit(0);
        }
        {
            Sounds.playSound("soundto32.au");

            Sounds.playSound("elonSound.au");
            Drawings.cleanFromFile(terminal, "IntroStartText.txt", 25, 15);
            Drawings.drawFromFile(terminal, "IntroStartText.txt", 25, 15);
            Thread.sleep(16000); //waiting for music
            Drawings.cleanFromFile(terminal, "IntroStartText.txt", 25, 15);

            // mouse total 6800 ms
            Drawings.drawFromFile(terminal, "CutSceneText4.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText4.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText5.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText5.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText6.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText6.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText7.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText7.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText8.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText8.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText9.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText9.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText10.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText10.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText11.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText11.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText12.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText12.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText13.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText13.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText14.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText14.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText15.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText15.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText16.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText16.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText17.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText17.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText18.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText18.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText19.txt", 0, 0);
            Thread.sleep(400);
            Drawings.cleanFromFile(terminal, "CutSceneText19.txt", 0, 0);
            Drawings.drawFromFile(terminal, "CutSceneText20.txt", 0, 0);
            Thread.sleep(2400);
            Drawings.cleanFromFile(terminal, "CutSceneText20.txt", 0, 0);


            Drawings.drawFromFile(terminal, "CutSceneText2.txt", 0, 0);
            Thread.sleep(7200); //waiting for music
            Drawings.cleanFromFile(terminal, "CutSceneText2.txt", 0, 0);
        }

        Random r = new Random();
        int xPos = 96;
        int yPos = 50;
        int friendXpos = r.nextInt(170) + 15;
        int friendYpos = -1;

        //adding player ship
        ThreadPlayer tp = new ThreadPlayer(terminal, lock, xPos, yPos);
        tp.start();

        //adding mouse friends
        ThreadFriends tf = new ThreadFriends(terminal, lock, friendXpos, friendYpos);
        tf.start();

        //adding stars and creating thread
        ThreadBackground tb = new ThreadBackground(terminal, lock);
        tb.start();

        Sounds.playSound("soundfrom32.au");

        boolean mouseAlive = true;
        int score = 0;

        while (game) {

            int counter = 0;

            //wait for a key to be pressed
            Key keyMove = null;
            do {

                counter++;

                if (counter % 20 == 0) {

                    if (mouseAlive) {
                        // mouse falling down
                        Drawings.cleanFromFile(terminal, "Mice.txt", friendXpos, friendYpos);
                        friendYpos += 1;
                        Drawings.drawFromFile(terminal, "Mice.txt", friendXpos, friendYpos);

                        if (((friendXpos + 3) >= (xPos + 6) && (friendXpos + 3) <= (xPos + 12)) && (friendYpos > yPos - 4)) {


                            Drawings.cleanFromFile(terminal, "Mice.txt", friendXpos, friendYpos);
                            score += 1;
                            Sounds.playSound("mouseSound.au");
                            System.out.println(score);
                            friendXpos = r.nextInt(170) + 15;
                            friendYpos = -1;

                        } else if (friendYpos > yPos + 4) {

                            Sounds.playSound("gameOver.au");
                            terminal.exitPrivateMode();
                            System.out.println("YOU COLLECTED " + score + " SPACE MICE!");
                            // Make something to restart game without intro sceen
                            break;

                        }
                    }
                }
                Thread.sleep(5);
                keyMove = terminal.readInput();
            }
            while (keyMove == null);

            switch (keyMove.getKind()) {
                case ArrowLeft:
                    Drawings.cleanFromFile(terminal, "Ship.txt", xPos, yPos);
                    xPos -= 2;
                    Drawings.drawFromFile(terminal, "Ship.txt", xPos, yPos);

                    break;
                case ArrowRight:
                    Drawings.cleanFromFile(terminal, "Ship.txt", xPos, yPos);
                    xPos += 2;
                    Drawings.drawFromFile(terminal, "Ship.txt", xPos, yPos);

                    break;
                default:
            }
        }
    }
}