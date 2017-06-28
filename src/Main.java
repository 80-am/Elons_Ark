import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.SwingTerminal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static com.googlecode.lanterna.input.Key.Kind.ArrowLeft;
import static com.googlecode.lanterna.input.Key.Kind.ArrowRight;


public class Main {
    public static void main(String[] args) throws InterruptedException, Exception {

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
                tib.stop();

        }


        //writing text after Start screen
         {

             Drawings.cleanFromFile(terminal,"CutSceneText1.txt",0, 0);
             Drawings.drawFromFile(terminal, "CutSceneText1.txt", 0, 0);
             Thread.sleep(10000); //waiting for music
             Drawings.cleanFromFile(terminal, "CutSceneText1.txt",0 ,0);
        }


        //adding stars and creating thread
        ThreadBackground tb = new ThreadBackground(terminal, lock);
        tb.start();

        //adding player ship
        ThreadPlayer tp = new ThreadPlayer(terminal, lock);
        tp.start();


        int xPos = 96;
        int yPos = 50;

        while (game) {

            //wait for a key to be pressed
            Key keyMove;
            do {
                Thread.sleep(5);
                keyMove = terminal.readInput();
            }
            while (keyMove == null);

            switch (keyMove.getKind()) {
                case ArrowLeft:
                    Drawings.cleanFromFile(terminal, "Ship.txt", xPos, yPos);
                    xPos -= 1;
                    Drawings.drawFromFile(terminal, "Ship.txt",xPos,yPos);

                    break;
                case ArrowRight:
                    Drawings.cleanFromFile(terminal,"Ship.txt", xPos, yPos);
                    xPos += 1;
                    Drawings.drawFromFile(terminal, "Ship.txt",xPos,yPos);

                    break;
                default:
            }
        }
    }
}