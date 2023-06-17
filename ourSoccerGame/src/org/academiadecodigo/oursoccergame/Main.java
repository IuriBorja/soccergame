package org.academiadecodigo.oursoccergame;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
    public static void main(String[] args) {

        //Create game
        Game game = new Game();
        game.start();
        Picture background = new Picture(10, 10, "resources/background.png");
        background.draw();
    }
}
