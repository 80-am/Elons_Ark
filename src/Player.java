import com.googlecode.lanterna.terminal.Terminal;

import java.util.ArrayList;
import java.util.List;

public class Player {

    // HitPoints symbol ❤

//    public List<Laser> fireLasers = new ArrayList<Laser>();

    public int x;
    public int y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void writeShip(Terminal terminal) {

        terminal.moveCursor(x,y);
        terminal.putCharacter('|');
        terminal.moveCursor(x-1,y+1);
        terminal.putCharacter('/');
        terminal.moveCursor(x+1,y+1);
        terminal.putCharacter('\\');
        terminal.moveCursor(x-2,y+2);
        terminal.putCharacter('/');
        terminal.moveCursor(x,y+2);
        terminal.putCharacter('_');
        terminal.moveCursor(x+2,y+2);
        terminal.putCharacter('\\');
        terminal.moveCursor(x-3,y+3);
        terminal.putCharacter('|');
        terminal.moveCursor(x-2,y+3);
        terminal.putCharacter('.');
        terminal.moveCursor(x-1,y+3);
        terminal.putCharacter('o');
        terminal.moveCursor(x+1,y+3);
        terminal.putCharacter('\'');
        terminal.moveCursor(x+2,y+3);
        terminal.putCharacter('.');
        terminal.moveCursor(x+3,y+3);
        terminal.putCharacter('|');
        terminal.moveCursor(x-5,y+4);
        terminal.putCharacter(',');
        terminal.moveCursor(x-4,y+4);
        terminal.putCharacter('\'');
        terminal.moveCursor(x-3,y+4);
        terminal.putCharacter('|');
        terminal.moveCursor(x,y+4);
        terminal.putCharacter('|');
        terminal.moveCursor(x+3,y+4);
        terminal.putCharacter('|');
        terminal.moveCursor(x+4,y+4);
        terminal.putCharacter('`');
        terminal.moveCursor(x+5,y+4);
        terminal.putCharacter('.');
        terminal.moveCursor(x-6,y+5);
        terminal.putCharacter('/');
        terminal.moveCursor(x-3,y+5);
        terminal.putCharacter('|');
        terminal.moveCursor(x,y+5);
        terminal.putCharacter('|');
        terminal.moveCursor(x+3,y+5);
        terminal.putCharacter('|');
        terminal.moveCursor(x+6,y+5);
        terminal.putCharacter('\\');
        terminal.moveCursor(x-6,y+6);
        terminal.putCharacter('|');
        terminal.moveCursor(x-5,y+6);
        terminal.putCharacter(',');
        terminal.moveCursor(x-4,y+6);
        terminal.putCharacter('-');
        terminal.moveCursor(x-3,y+6);
        terminal.putCharacter('\'');
        terminal.moveCursor(x-2,y+6);
        terminal.putCharacter('-');
        terminal.moveCursor(x-1,y+6);
        terminal.putCharacter('-');
        terminal.moveCursor(x,y+6);
        terminal.putCharacter('|');
        terminal.moveCursor(x+1,y+6);
        terminal.putCharacter('-');
        terminal.moveCursor(x+2,y+6);
        terminal.putCharacter('-');
        terminal.moveCursor(x+3,y+6);
        terminal.putCharacter('\'');
        terminal.moveCursor(x+4,y+6);
        terminal.putCharacter('-');
        terminal.moveCursor(x+5,y+6);
        terminal.putCharacter('.');
        terminal.moveCursor(x+6,y+6);
        terminal.putCharacter('|');


    }

//    public void fire(Terminal terminal, int x, int y){
//        Laser laser = new Laser(x, y-1);
//        fireLasers.add(laser);
//        laser.launchLaser(terminal);
//
//
//    }
}