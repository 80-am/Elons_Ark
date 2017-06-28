import com.googlecode.lanterna.terminal.Terminal;

public class Intro {

    public int x = 50;
    public int y = 20;
    public int z = 80; // adjust z to centre developer names


    public void startScreen(Terminal terminal) {

        //Printing out game name ''Elon's Ark''

        terminal.moveCursor(x, y); // E FIRST ROW
        terminal.putCharacter('_');
        terminal.moveCursor(x + 1, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 2, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 3, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 4, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 5, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 6, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 10, y); //L
        terminal.putCharacter('_');
        terminal.moveCursor(x + 11, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 20, y); //O
        terminal.putCharacter('_');
        terminal.moveCursor(x + 21, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 22, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 23, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 24, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 25, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 29, y); //N
        terminal.putCharacter('.');
        terminal.moveCursor(x + 30, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 31, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 35, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 36, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 37, y);
        terminal.putCharacter('.');
        terminal.moveCursor(x + 44, y); //S
        terminal.putCharacter('_');
        terminal.moveCursor(x + 45, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 46, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 47, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 48, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 49, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 50, y);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 51, y);
        terminal.putCharacter('.');
        terminal.moveCursor(x + 60, y); //A
        terminal.putCharacter('-');
        terminal.moveCursor(x + 61, y);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 62, y);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 69, y); //R
        terminal.putCharacter('.');
        terminal.moveCursor(x + 70, y);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 71, y);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 72, y);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 73, y);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 74, y);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 75, y);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 83, y); //K
        terminal.putCharacter('-');
        terminal.moveCursor(x + 84, y);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 87, y);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 88, y);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 89, y);
        terminal.putCharacter('-');
        terminal.moveCursor(x, y + 1); //E SECOND ROW
        terminal.putCharacter('|');
        terminal.moveCursor(x + 4, y + 1);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 5, y + 1);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 6, y + 1);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 7, y + 1);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 8, y + 1);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 9, y + 1); //L
        terminal.putCharacter('|');
        terminal.moveCursor(x + 12, y + 1);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 19, y + 1); //O
        terminal.putCharacter('/');
        terminal.moveCursor(x + 22, y + 1);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 23, y + 1);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 26, y + 1);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 29, y + 1); //N
        terminal.putCharacter('|');
        terminal.moveCursor(x + 32, y + 1);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 34, y + 1);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 37, y + 1);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 43, y + 1); //S
        terminal.putCharacter('/');
        terminal.moveCursor(x + 51, y + 1);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 59, y + 1); //A
        terminal.putCharacter('/');
        terminal.moveCursor(x + 63, y + 1);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 69, y + 1); //R
        terminal.putCharacter('|');
        terminal.moveCursor(x + 73, y + 1);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 76, y + 1);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 82, y + 1); //K
        terminal.putCharacter('|');
        terminal.moveCursor(x + 85, y + 1);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 86, y + 1);
        terminal.putCharacter('/');
        terminal.moveCursor(x + 89, y + 1);
        terminal.putCharacter('/');
        terminal.moveCursor(x, y + 2); //E Third row
        terminal.putCharacter('|');
        terminal.moveCursor(x + 3, y + 2);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 4, y + 2);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 5, y + 2);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 9, y + 2); //L
        terminal.putCharacter('|');
        terminal.moveCursor(x + 12, y + 2);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 18, y + 2); //O
        terminal.putCharacter('|');
        terminal.moveCursor(x + 21, y + 2);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 24, y + 2);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 27, y + 2);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 29, y + 2); //N
        terminal.putCharacter('|');
        terminal.moveCursor(x + 33, y + 2);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 34, y + 2);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 37, y + 2);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 42, y + 2); //S
        terminal.putCharacter('|');
        terminal.moveCursor(x + 46, y + 2);
        terminal.putCharacter('(');
        terminal.moveCursor(x + 47, y + 2);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 48, y + 2);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 49, y + 2);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 50, y + 2);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 51, y + 2);
        terminal.putCharacter('`');
        terminal.moveCursor(x + 58, y + 2); //A
        terminal.putCharacter('/');
        terminal.moveCursor(x + 61, y + 2);
        terminal.putCharacter('^');
        terminal.moveCursor(x + 64, y + 2);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 69, y + 2); //R
        terminal.putCharacter('|');
        terminal.moveCursor(x + 72, y + 2);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 73, y + 2);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 74, y + 2);
        terminal.putCharacter(')');
        terminal.moveCursor(x + 77, y + 2);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 82, y + 2); //K
        terminal.putCharacter('|');
        terminal.moveCursor(x + 85, y + 2);
        terminal.putCharacter('\'');
        terminal.moveCursor(x + 88, y + 2);
        terminal.putCharacter('/');
        terminal.moveCursor(x, y + 3); //E Forth row
        terminal.putCharacter('|');
        terminal.moveCursor(x + 4, y + 3);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 5, y + 3);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 6, y + 3);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 9, y + 3); //L
        terminal.putCharacter('|');
        terminal.moveCursor(x + 12, y + 3);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 18, y + 3); //O
        terminal.putCharacter('|');
        terminal.moveCursor(x + 21, y + 3);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 25, y + 3);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 27, y + 3);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 29, y + 3); //N
        terminal.putCharacter('|');
        terminal.moveCursor(x + 32, y + 3);
        terminal.putCharacter('.');
        terminal.moveCursor(x + 34, y + 3);
        terminal.putCharacter('`');
        terminal.moveCursor(x + 37, y + 3);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 43, y + 3); //S
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 47, y + 3);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 57, y + 3); //A
        terminal.putCharacter('/');
        terminal.moveCursor(x + 60, y + 3);
        terminal.putCharacter('/');
        terminal.moveCursor(x + 61, y + 3);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 62, y + 3);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 65, y + 3);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 69, y + 3); //R
        terminal.putCharacter('|');
        terminal.moveCursor(x + 76, y + 3);
        terminal.putCharacter('/');
        terminal.moveCursor(x + 82, y + 3); //K
        terminal.putCharacter('|');
        terminal.moveCursor(x + 87, y + 3);
        terminal.putCharacter('<');
        terminal.moveCursor(x, y + 4); //E Fifth row
        terminal.putCharacter('|');
        terminal.moveCursor(x + 3, y + 4);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 4, y + 4);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 5, y + 4);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 6, y + 4);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 7, y + 4);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 9, y + 4); //L
        terminal.putCharacter('|');
        terminal.moveCursor(x + 12, y + 4);
        terminal.putCharacter('`');
        terminal.moveCursor(x + 13, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 14, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 15, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 16, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 17, y + 4);
        terminal.putCharacter('.');
        terminal.moveCursor(x + 18, y + 4); //O
        terminal.putCharacter('|');
        terminal.moveCursor(x + 21, y + 4);
        terminal.putCharacter('`');
        terminal.moveCursor(x + 22, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 23, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 24, y + 4);
        terminal.putCharacter('\'');
        terminal.moveCursor(x + 27, y + 4);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 29, y + 4); //N
        terminal.putCharacter('|');
        terminal.moveCursor(x + 32, y + 4);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 33, y + 4);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 37, y + 4);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 39, y + 4); //S
        terminal.putCharacter('.');
        terminal.moveCursor(x + 40, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 41, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 42, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 43, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 44, y + 4);
        terminal.putCharacter(')');
        terminal.moveCursor(x + 48, y + 4);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 56, y + 4); //A
        terminal.putCharacter('/');
        terminal.moveCursor(x + 59, y + 4);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 60, y + 4);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 61, y + 4);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 62, y + 4);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 63, y + 4);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 66, y + 4);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 69, y + 4); //R
        terminal.putCharacter('|');
        terminal.moveCursor(x + 72, y + 4);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 73, y + 4);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 76, y + 4);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 77, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 78, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 79, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 80, y + 4);
        terminal.putCharacter('-');
        terminal.moveCursor(x + 81, y + 4);
        terminal.putCharacter('.');
        terminal.moveCursor(x + 82, y + 4); //K
        terminal.putCharacter('|');
        terminal.moveCursor(x + 85, y + 4);
        terminal.putCharacter('.');
        terminal.moveCursor(x + 88, y + 4);
        terminal.putCharacter('\\');
        terminal.moveCursor(x, y + 5); //E Last row
        terminal.putCharacter('|');
        terminal.moveCursor(x + 1, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 2, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 3, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 4, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 5, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 6, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 7, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 8, y + 5);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 9, y + 5); //L
        terminal.putCharacter('|');
        terminal.moveCursor(x + 10, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 11, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 12, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 13, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 14, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 15, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 16, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 17, y + 5);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 19, y + 5); //O
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 20, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 21, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 22, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 23, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 24, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 25, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 26, y + 5);
        terminal.putCharacter('/');
        terminal.moveCursor(x + 29, y + 5); //N
        terminal.putCharacter('|');
        terminal.moveCursor(x + 30, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 31, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 32, y + 5);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 34, y + 5);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 35, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 36, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 37, y + 5);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 39, y + 5); //S
        terminal.putCharacter('|');
        terminal.moveCursor(x + 40, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 41, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 42, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 43, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 44, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 45, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 46, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 47, y + 5);
        terminal.putCharacter('/');
        terminal.moveCursor(x + 55, y + 5); //A
        terminal.putCharacter('/');
        terminal.moveCursor(x + 56, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 57, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 58, y + 5);
        terminal.putCharacter('/');
        terminal.moveCursor(x + 64, y + 5);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 65, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 66, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 67, y + 5);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 69, y + 5); //R
        terminal.putCharacter('|');
        terminal.moveCursor(x + 71, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 72, y + 5);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 74, y + 5);
        terminal.putCharacter('`');
        terminal.moveCursor(x + 75, y + 5);
        terminal.putCharacter('.');
        terminal.moveCursor(x + 76, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 77, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 78, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 79, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 80, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 81, y + 5);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 82, y + 5); //K
        terminal.putCharacter('|');
        terminal.moveCursor(x + 83, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 84, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 85, y + 5);
        terminal.putCharacter('|');
        terminal.moveCursor(x + 86, y + 5);
        terminal.putCharacter('\\');
        terminal.moveCursor(x + 87, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 88, y + 5);
        terminal.putCharacter('_');
        terminal.moveCursor(x + 89, y + 5);
        terminal.putCharacter('\\');
        terminal.moveCursor(z, y + 7);
        terminal.putCharacter('A');
        terminal.moveCursor(z + 2, y + 7);
        terminal.putCharacter('G');
        terminal.moveCursor(z + 3, y + 7);
        terminal.putCharacter('A');
        terminal.moveCursor(z + 4, y + 7);
        terminal.putCharacter('M');
        terminal.moveCursor(z + 5, y + 7);
        terminal.putCharacter('E');
        terminal.moveCursor(z + 7, y + 7);
        terminal.putCharacter('B');
        terminal.moveCursor(z + 8, y + 7);
        terminal.putCharacter('Y');
        terminal.moveCursor(z + 10, y + 7);
        terminal.putCharacter('S');
        terminal.moveCursor(z + 11, y + 7);
        terminal.putCharacter('O');
        terminal.moveCursor(z + 12, y + 7);
        terminal.putCharacter('P');
        terminal.moveCursor(z + 13, y + 7);
        terminal.putCharacter('H');
        terminal.moveCursor(z + 14, y + 7);
        terminal.putCharacter('I');
        terminal.moveCursor(z + 15, y + 7);
        terminal.putCharacter('A');
        terminal.moveCursor(z + 16, y + 7);
        terminal.putCharacter(',');
        terminal.moveCursor(z + 18, y + 7);
        terminal.putCharacter('J');
        terminal.moveCursor(z + 19, y + 7);
        terminal.putCharacter('O');
        terminal.moveCursor(z + 20, y + 7);
        terminal.putCharacter('A');
        terminal.moveCursor(z + 21, y + 7);
        terminal.putCharacter('K');
        terminal.moveCursor(z + 22, y + 7);
        terminal.putCharacter('I');
        terminal.moveCursor(z + 23, y + 7);
        terminal.putCharacter('M');
        terminal.moveCursor(z + 25, y + 7);
        terminal.putCharacter('&');
        terminal.moveCursor(z + 27, y + 7);
        terminal.putCharacter('A');
        terminal.moveCursor(z + 28, y + 7);
        terminal.putCharacter('D');
        terminal.moveCursor(z + 29, y + 7);
        terminal.putCharacter('A');
        terminal.moveCursor(z + 30, y + 7);
        terminal.putCharacter('M');
        terminal.moveCursor(z + 6, y + 9);
        terminal.putCharacter('P');
        terminal.moveCursor(z + 7, y + 9);
        terminal.putCharacter('R');
        terminal.moveCursor(z + 8, y + 9);
        terminal.putCharacter('E');
        terminal.moveCursor(z + 9, y + 9);
        terminal.putCharacter('S');
        terminal.moveCursor(z + 10, y + 9);
        terminal.putCharacter('S');
        terminal.moveCursor(z + 12, y + 9);
        terminal.putCharacter('E');
        terminal.moveCursor(z + 13, y + 9);
        terminal.putCharacter('N');
        terminal.moveCursor(z + 14, y + 9);
        terminal.putCharacter('T');
        terminal.moveCursor(z + 15, y + 9);
        terminal.putCharacter('E');
        terminal.moveCursor(z + 16, y + 9);
        terminal.putCharacter('R');
        terminal.moveCursor(z + 18, y + 9);
        terminal.putCharacter('T');
        terminal.moveCursor(z + 19, y + 9);
        terminal.putCharacter('O');
        terminal.moveCursor(z + 21, y + 9);
        terminal.putCharacter('S');
        terminal.moveCursor(z + 22, y + 9);
        terminal.putCharacter('T');
        terminal.moveCursor(z + 23, y + 9);
        terminal.putCharacter('A');
        terminal.moveCursor(z + 24, y + 9);
        terminal.putCharacter('R');
        terminal.moveCursor(z + 25, y + 9);
        terminal.putCharacter('T');

        /*
 _______  __        ______   .__   __.      _______.        ___      .______       __  ___
|   ____||  |      /  __  \  |  \ |  |     /       |       /   \     |   _  \     |  |/  /
|  |__   |  |     |  |  |  | |   \|  |    |   (----`      /  ^  \    |  |_)  |    |  '  /
|   __|  |  |     |  |  |  | |  . `  |     \   \         /  /_\  \   |      /     |    <
|  |____ |  `----.|  `--'  | |  |\   | .----)   |       /  _____  \  |  |\  \----.|  .  \
|_______||_______| \______/  |__| \__| |_______/       /__/     \__\ | _| `._____||__|\__\




         */

    }
}