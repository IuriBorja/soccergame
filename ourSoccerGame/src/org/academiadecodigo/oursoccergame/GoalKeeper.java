package org.academiadecodigo.oursoccergame;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GoalKeeper {

    private Picture noSaveCenter;

    public GoalKeeper() {

        noSaveCenter = new Picture(250, 200, "ourSoccerGame/resources/KeeperDefaultPos.png");
        noSaveCenter.draw();
    }
    //Create saveLeft:
    Picture keeperSaveLeft = new Picture(50, 100, "ourSoccerGame/resources/KeeperSaveLeft.png");

    //Create saveRight:
    Picture keeperSaveRight = new Picture(430, 100, "ourSoccerGame/resources/KeeperSaveRight.png");

    //Create saveCenter:
    Picture keeperSaveCenter = new Picture(250, 100, "ourSoccerGame/resources/KeeperSaveCenter.png");

    //Create noSaveLeft:
    Picture noSaveLeft = new Picture(50, 100, "ourSoccerGame/resources/NoSaveLeft1.png");

    //Create noSaveRight:
    Picture noSaveRight = new Picture(430, 100, "ourSoccerGame/resources/NoSaveRight1.png");

    //Create ball center:
    Picture goalCenter = new Picture(250, 200, "ourSoccerGame/resources/Ball.png");

    //Create ball right:
    Picture goalRight = new Picture(580, 100, "ourSoccerGame/resources/Ball.png");

    //Create ball left:
    Picture goalLeft = new Picture(-100, 100, "ourSoccerGame/resources/Ball.png");


    public void chooseSideGoalkeeper(Directions playerDirection) {

        Directions directions = Directions.randomDirections();

        switch (directions) {
            case LEFT:
                chooseLeft(playerDirection);
                break;
            case RIGHT:
                chooseRight(playerDirection);
                break;
            case CENTER:
                chooseCenter(playerDirection);
        }
    }


    public void chooseRight(Directions playerDirection) {
        Directions right = Directions.RIGHT;
        noSaveCenter.delete();

        if (playerDirection == right) {
            keeperSaveRight.draw();
        }
        else if (playerDirection == Directions.CENTER){
            noSaveRight.draw();
            goalCenter.draw();
        }
        else
        {
            noSaveRight.draw();
            goalLeft.draw();
        }

    }

    public void chooseLeft(Directions playerDirection) {
        Directions left =  Directions.LEFT;
        noSaveCenter.delete();

        if (playerDirection == left){
            keeperSaveLeft.draw();
        }
        else if(playerDirection == Directions.CENTER)
        {
            noSaveLeft.draw();
            goalCenter.draw();
        }
        else
        {
            noSaveLeft.draw();
            goalRight.draw();
        }
    }

    public void chooseCenter(Directions playerDirection) {
        Directions center = Directions.CENTER;

        if (playerDirection == center){
            noSaveCenter.delete();
            keeperSaveCenter.draw();
        }
        else if (playerDirection == Directions.RIGHT){
            noSaveCenter.draw();
            goalRight.draw();
        }
        else
        {
            noSaveCenter.draw();
            goalLeft.draw();
        }
    }

    public void clear() {

        goalLeft.delete();
        goalCenter.delete();
        goalRight.delete();
        keeperSaveCenter.delete();
        keeperSaveLeft.delete();
        keeperSaveRight.delete();
        noSaveLeft.delete();
        noSaveRight.delete();

        noSaveCenter.draw();
    }


}
