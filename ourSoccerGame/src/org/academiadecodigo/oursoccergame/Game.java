package org.academiadecodigo.oursoccergame;

public class Game {

    private GoalKeeper goalKeeper;
    private Handler handler;
    private Player player;

    public void start()
    {
        goalKeeper = new GoalKeeper();
        handler = new Handler();
        player = new Player(goalKeeper);

    }


}
