package codeAlong6;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Game {

    private Cloud currCloud;

    public Game(Pane gamePane){
        this.currCloud = new Cloud(gamePane, Constants.CLOUD_1);
        new Cloud(gamePane, Constants.CLOUD_2);
        gamePane.setFocusTraversable(true);
        gamePane.setOnKeyPressed((KeyEvent e) -> this.onKeyPressed(e));
        this.setupTimeline();
    }

    private void onKeyPressed(KeyEvent e){
        switch (e.getCode()){
            case RIGHT:
                this.currCloud.moveRight();
                break;
            case LEFT:
                this.currCloud.moveLeft();
                break;
            case UP:
                this.currCloud.moveUp();
                break;
            case DOWN:
                this.currCloud.moveDown();
                break;
            default:
                break;

        }
        e.consume();
    }

    private void setupTimeline(){
        KeyFrame kf = new KeyFrame(new Duration(500), (ActionEvent e) -> this.currCloud.moveDown());
        Timeline timeline = new Timeline(kf);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }
}
