import com.googlecode.lanterna.terminal.Terminal;
import java.util.Random;

public class Background {

    private Terminal terminal;

    public Background(Terminal terminal) {
        this.terminal = terminal;
    }
    public void addStars() {
        Random r = new Random();
        terminal.moveCursor(r.nextInt(190)+1, r.nextInt(58)+1);
        terminal.putCharacter('.');
        terminal.moveCursor(r.nextInt(190)+1, r.nextInt(58)+1);
        terminal.putCharacter('.');
        terminal.moveCursor(r.nextInt(190)+1, r.nextInt(58)+1);
        terminal.putCharacter('.');
        terminal.moveCursor(r.nextInt(190)+1, r.nextInt(58)+1);
        terminal.putCharacter('.');
        terminal.moveCursor(r.nextInt(190)+1, r.nextInt(58)+1);
        terminal.putCharacter('.');
        terminal.moveCursor(r.nextInt(190)+1, r.nextInt(58)+1);
        terminal.putCharacter('.');
        terminal.moveCursor(r.nextInt(190)+1, r.nextInt(58)+1);
        terminal.putCharacter('.');
        terminal.moveCursor(r.nextInt(190)+1, r.nextInt(58)+1);
        terminal.putCharacter('.');
        terminal.moveCursor(r.nextInt(190)+1, r.nextInt(58)+1);
        terminal.putCharacter('.');
        terminal.moveCursor(r.nextInt(190)+1, r.nextInt(58)+1);
        terminal.putCharacter('.');
        terminal.moveCursor(r.nextInt(190)+1, r.nextInt(58)+1);
        terminal.putCharacter('.');
        terminal.moveCursor(r.nextInt(190)+1, r.nextInt(58)+1);
        terminal.putCharacter('.');
    }
}
