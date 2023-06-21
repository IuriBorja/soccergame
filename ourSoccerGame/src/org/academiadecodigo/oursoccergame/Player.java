package org.academiadecodigo.oursoccergame;

public class Player {

    private GoalKeeper goalKeeper;
    private boolean delayReached = false;
    private boolean delayHasAlreadyStarted = false;

    public Player(GoalKeeper goalKeeper){
        this.goalKeeper = goalKeeper;
    }

    public void kick(Directions playerDirection) throws InterruptedException {


        //if the delay has reached or if is the first time
        if (delayReached || !delayHasAlreadyStarted) {
            goalKeeper.clear();
            goalKeeper.chooseSideGoalkeeper(playerDirection);
            delayHasAlreadyStarted = false;
            delayReached = false;
        }

            //if the delay not started
            if (!delayHasAlreadyStarted)
            {

                Thread inputThread = new Thread(() -> {
                    try {
                        delayHasAlreadyStarted = true;
                        Thread.sleep(5000); // Sleep for 5 seconds
                        delayReached = true;
                    } catch (InterruptedException e) {
                        // Handle interrupted exception if needed
                        e.printStackTrace();
                    }
                });
                inputThread.start();
            }
    }
}
