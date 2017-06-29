import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.SwingTerminal;

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


/*
        // how to add intromusic and get out of loop?

        boolean startScreenSong = true;

        while (startScreenSong) {


            Sounds.playSound("startScreen.au");
            Thread.sleep(3900);

        }*/

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

            Sounds.playSound("soundto32.au");

            Drawings.cleanFromFile(terminal, "CutSceneText1.txt", 2, 20);
            Drawings.drawFromFile(terminal, "CutSceneText1.txt", 2, 20);
            Thread.sleep(16000); //waiting for music
            Drawings.cleanFromFile(terminal, "CutSceneText1.txt", 2, 20);

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

        int xPos = 96;
        int yPos = 50;
        int friendXpos = 40;
        int friendYpos = 0;



        //adding stars and creating thread
        ThreadBackground tb = new ThreadBackground(terminal, lock);
        tb.start();

        //adding player ship
        ThreadPlayer tp = new ThreadPlayer(terminal, lock);
        tp.start();

        //adding mouse friends
        ThreadFriends tf = new ThreadFriends(terminal, lock);
        tf.start();


        Sounds.playSound("soundfrom32.au");

        while (game) {


            // mouse falling down

            Drawings.cleanFromFile(terminal,"Mice.txt", friendXpos, friendYpos);
            Drawings.drawFromFile(terminal,"Mice.txt", friendXpos, friendYpos);
            friendYpos += 1;
            Drawings.cleanFromFile(terminal,"Mice.txt", friendXpos, friendYpos);


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
                    xPos -= 1.8f;
                    Drawings.drawFromFile(terminal, "Ship.txt", xPos, yPos);

                    break;
                case ArrowRight:
                    Drawings.cleanFromFile(terminal, "Ship.txt", xPos, yPos);
                    xPos += 1.8f;
                    Drawings.drawFromFile(terminal, "Ship.txt", xPos, yPos);

                    break;
                default:
            }
            /* Getting points

            int score = 0;
            int hitPoints = 3;

            if ((friendXpos == xPos) && (friendYpos ==yPos)) {

                // this create 1 point
                score += 1;


            // doing health stuff and game over

            int hitPoints = 3;
            int gameBottom = 60;

            if (friendYpos == gameBottom) {

                hitPoints -= 1;
            }

            if (hitPoints <= 0) {

                game = false;

                Drawings.cleanFromFile(terminal, "Ship.txt", xPos, yPos);
                Drawings.cleanFromFile(terminal, "Stars1.txt", xPos, yPos);
                Drawings.cleanFromFile(terminal, "Stars2.txt", xPos, yPos);
                Drawings.cleanFromFile(terminal, "Stars3.txt", xPos, yPos);
                Drawings.cleanFromFile(terminal, "Mice.txt", xPos, yPos);
                xPos -= 1.8f;
                Drawings.drawFromFile(terminal, "GameOver.txt", xPos, yPos);
                Thread.sleep(5000);
                // Make something to restart game without intro sceenes

            }
            }

             */


        }
    }
}