package codeAlong6;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class Bubble {

    private Circle bubble;

    public Bubble(Pane pane, int x, int y){
        this.createBubble(pane,x,y);
    }

    private void createBubble(Pane pane, int x, int y){
        this.bubble = new Circle(x,y,Constants.BUBBLE_SIZE);
        this.bubble.setFill(Constants.BUBBLE_COLOR);
        pane.getChildren().add(this.bubble);
    }

    public void moveRight(){
        this.bubble.setCenterX(this.bubble.getCenterX() + Constants.BUBBLE_OFFSET);
    }

    public void moveLeft(){
        this.bubble.setCenterX(this.bubble.getCenterX() - Constants.BUBBLE_OFFSET);
    }

    public void moveUp(){
        this.bubble.setCenterY(this.bubble.getCenterY() - Constants.BUBBLE_OFFSET);
    }

    public void moveDown(){
        this.bubble.setCenterY(this.bubble.getCenterY() + Constants.BUBBLE_OFFSET);
    }
}
