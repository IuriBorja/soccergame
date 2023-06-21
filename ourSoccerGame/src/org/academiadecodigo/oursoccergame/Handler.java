package org.academiadecodigo.oursoccergame;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Handler implements KeyboardHandler {

    public Keyboard keyboard;
    public Player player;

    public Handler(Player player)
    {

        this.player = player;
        keyboard = new Keyboard(this);
        createKeyboardEvents();

    }

    public void createKeyboardEvents()
    {

        KeyboardEvent keyboardEventRight = new KeyboardEvent();
        keyboardEventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventRight.setKey(KeyboardEvent.KEY_RIGHT);
        keyboard.addEventListener(keyboardEventRight);

        KeyboardEvent keyboardEventLeft = new KeyboardEvent();
        keyboardEventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventLeft.setKey(KeyboardEvent.KEY_LEFT);
        keyboard.addEventListener(keyboardEventLeft);

        KeyboardEvent keyboardEventMiddle = new KeyboardEvent();
        keyboardEventMiddle.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventMiddle.setKey((KeyboardEvent.KEY_DOWN));
        keyboard.addEventListener((keyboardEventMiddle));

        KeyboardEvent keyboardEventP = new KeyboardEvent();
        keyboardEventP.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventP.setKey(KeyboardEvent.KEY_P);
        keyboard.addEventListener(keyboardEventP);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent)
    {
        switch(keyboardEvent.getKey())
        {
            case KeyboardEvent.KEY_RIGHT:
                try {
                        player.kick(Directions.RIGHT);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;

            case KeyboardEvent.KEY_LEFT:
                try {
                    player.kick(Directions.LEFT);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;

            case KeyboardEvent.KEY_DOWN:
                try {
                    player.kick(Directions.CENTER);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;

            case KeyboardEvent.KEY_P:
                System.exit(1);
                break;
            default:
                break;

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
