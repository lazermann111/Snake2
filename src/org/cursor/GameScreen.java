package org.cursor;

import org.cursor.gameobjects.ObjectOnScreen;

public class GameScreen {
    int screenSize = 10;
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
//
//    public boolean is2ObjectsIntersecting(ObjectOnScreen o1, ObjectOnScreen o2) {
//        return o1.x == o2.x && o1.y == o2.y;
//    }
}
