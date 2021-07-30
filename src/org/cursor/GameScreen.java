package org.cursor;

public class GameScreen {
    int screenSize = 20;
    char emptyCell = '*';
    char[][] screen = new char[screenSize][screenSize];

    //public GameScreen() { }
    //1
    void fillScreenWithBlankCells() {
        for (int i = 0; i < screenSize; i++) {
            for (int j = 0; j < screenSize; j++) {
                screen[i][j] = emptyCell;
            }
        }
    }
    //2
    void printScreen() {
        for (int i = 0; i < screenSize; i++) {
            for (int j = 0; j < screenSize; j++) {
                System.out.print(screen[j][i]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    //3
    public void setObjectOnScreen(ObjectOnScreen o) {
        screen[o.x][o.y] = o.printableCharacter;
    }
}
