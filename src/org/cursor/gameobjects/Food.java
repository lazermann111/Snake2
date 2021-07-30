package org.cursor.gameobjects;

import org.cursor.ObjectOnScreen;

public class Food extends ObjectOnScreen {
    int growthFactor;

    public Food(int x, int y) {
        super(x, y, 'F');
        this.growthFactor = 1;
    }

//    void create(){ }
//    void destroy(){ }
}
