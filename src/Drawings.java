import com.googlecode.lanterna.terminal.Terminal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Drawings {

    public static void drawFromFile(Terminal terminal, String textPath) throws Exception {

        drawFromFile(terminal, textPath, 0, 0, false);

    }

    public static void drawFromFile(Terminal terminal, String textPath, int startX, int startY) throws Exception {

        drawFromFile(terminal, textPath, startX, startY, false);

    }

    public static void drawFromFile(Terminal terminal, String textPath, int startX, int startY, boolean doClean) throws Exception {


        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(textPath)));


        String inputLine = bufferedReader.readLine();

        int row = startY;

        while (inputLine != null) {

            for (int i = 0; i < inputLine.length(); i++) {

                char c = inputLine.charAt(i);
                if (c != ' ') {
                    terminal.moveCursor(i + startX, row);
                    terminal.putCharacter(c);
                }
                if (doClean) {
                    terminal.moveCursor(i + startX, row);
                    terminal.putCharacter(' ');
                }
            }

            row++;

            inputLine = bufferedReader.readLine();

        }
    }

    public static void cleanFromFile(Terminal terminal, String textPath, int startX, int startY) throws Exception {

        drawFromFile(terminal, textPath, startX, startY, true);

    }
}