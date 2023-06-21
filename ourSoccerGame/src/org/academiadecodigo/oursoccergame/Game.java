package org.academiadecodigo.oursoccergame;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private GoalKeeper goalKeeper;
    private Handler handler;
    private Player player;

    public void start()
    {
        Picture backGround = new Picture(10, 10, "ourSoccerGame/resources/background.png");
        backGround.draw();

        Text text = new Text(130, 50, "SCORE: ");
        text.setColor(Color.WHITE);
        text.grow(80, 30);
        text.draw();

        goalKeeper = new GoalKeeper();
        player = new Player(goalKeeper);
        handler = new Handler(player);

    }


}
