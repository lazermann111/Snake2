package org.cursor.gameobjects;

//Dog extend Animal
//Cat extend Animal

//Bycicle extend Vehicle
//Car extend Vehicle

import org.cursor.ObjectOnScreen;

public class Snake extends ObjectOnScreen {
    int currentLength;
    float speed;

    public Snake(int x, int y) {
        super(x, y, 'S');
    }


    void move() { }
}
