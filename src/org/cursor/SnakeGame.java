package org.cursor;

import org.cursor.gameobjects.Food;
import org.cursor.gameobjects.Snake;

import java.util.Scanner;

public class SnakeGame {
     // Input from player
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //game loading
        Snake snake = new Snake(12, 3);
        Food f = new Food(1, 2);
        Food f2 = new Food(4, 6);
        Food f3 = new Food(12, 2);

        GameScreen gameScreen = new GameScreen();
        gameScreen.fillScreenWithBlankCells();
        char input;
        //main loop
        while (true) {
            gameScreen.fillScreenWithBlankCells();
            gameScreen.setObjectOnScreen(snake);
            gameScreen.setObjectOnScreen(f);
            gameScreen.setObjectOnScreen(f2);
            gameScreen.setObjectOnScreen(f3);
            gameScreen.printScreen();

            //user input
            switch (input = scanner.nextLine().charAt(0)) {
                case 'a':
                    snake.x = snake.x -1;
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
            //todo calculate game state




        }
    }

}
