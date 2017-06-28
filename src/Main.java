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


        FileReader fR = new FileReader("/home/adam/Documents/Dev/Java/Academy/Elons Ark/Intro.txt");

        BufferedReader bR = new BufferedReader(fR);

        String s = bR.readLine();

        Drawings.drawFromFile(terminal,s );
//
//        //showing start screen
//        Intro startScreen = new Intro();
//        startScreen.startScreen(terminal);

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

                break;
            default:
                System.exit(0);

        }

        //adding stars and creating thread
        ThreadBackground tb = new ThreadBackground(terminal, lock);
        tb.start();


        while (game) {

            Player motherShip = new Player(96, 50);

            MyThread player = new MyThread(motherShip);
            player.start();
            motherShip.writeShip(terminal);

            //wait for a key to be pressed
            Key keyMove;
            do {
                Thread.sleep(5);
                keyMove = terminal.readInput();
            }
            while (keyMove == null);

            switch (keyMove.getKind()) {
                case ArrowLeft:
                    motherShip.x = motherShip.x - 1;

                    break;
                case ArrowRight:
                    motherShip.x = motherShip.x + 1;

                    break;
                default:
            }

            terminal.clearScreen();

        }


//
//        MyThread startGame = new MyThread(myList, lock);
//        threadObject.start();
//
//        while (true) {
//            try{
//                Thread.sleep(10);
//                synchronized (lock) {
//                    if (myList.get(0) != myList.get(0)) {
//                        System.out.println("How the...?");
//                    }
//                }
//            }catch (InterruptedException e){}
        }
    }