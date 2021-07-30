package org.cursor;

import org.cursor.gameobjects.Food;
import org.cursor.gameobjects.ObjectOnScreen;
import org.cursor.gameobjects.Snake;
import org.cursor.gameobjects.Wall;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class GameController {
    Snake snake;
    List<ObjectOnScreen> gameObjects;
    GameScreen gameScreen;
    Scanner scanner = new Scanner(System.in);

    private void init() {
        snake = new Snake(1, 3);
        gameObjects = new CopyOnWriteArrayList<>();
        gameObjects.add(new Food(1, 2));
        gameObjects.add(new Food(4, 6));
        gameObjects.add(new Food(2, 2));

        gameObjects.add(new Wall(2, 4));
        gameObjects.add(new Wall(2, 7));

        gameScreen = new GameScreen();
    }

    public void startGame() {
        init();
        mainLoop();
    }

    private void mainLoop() {
        while (true) {
            refreshScreen();
            userInput();
            updateGameState();
        }
    }

    private void updateGameState() {
        for (ObjectOnScreen obj : gameObjects) {
            if (snake.intersectsWith(obj)) {
                System.out.println("Collide!");
                snake.collideWith(obj);
                gameObjects.remove(obj);
            }
        }
    }

    private void userInput() {
        char input;
        switch (input = scanner.nextLine().charAt(0)) {
            case 'a':
                snake.x = snake.x - 1;
                break;
            case 'd':
                snake.x = snake.x + 1;
                break;
            case 'w':
                snake.y = snake.y + 1;
                break;
            case 's':
                snake.y = snake.y - 1;
                break;
        }
    }

    private void refreshScreen() {
        gameScreen.fillScreenWithBlankCells();
        gameScreen.setObjectOnScreen(snake);
        for (ObjectOnScreen drawable : gameObjects) {
            gameScreen.setObjectOnScreen(drawable);
        }
        gameScreen.printScreen();
    }
}
