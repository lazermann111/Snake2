package org.cursor;

public abstract class ObjectOnScreen {
     int x, y;
    char printableCharacter;

    public ObjectOnScreen(int x, int y, char printableCharacter) {
        this.x = x;
        this.y = y;
        this.printableCharacter = printableCharacter;
    }
}
