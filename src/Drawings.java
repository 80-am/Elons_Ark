import com.googlecode.lanterna.terminal.Terminal;

public class Drawings {

    public static void drawFromFile(Terminal terminal, String textPath) {

        for(int i = 0; i < textPath.length();i++){


            terminal.moveCursor(i,i);
            terminal.putCharacter(textPath.charAt(i));
        }
    }
}
