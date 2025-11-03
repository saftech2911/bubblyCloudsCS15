package codeAlong6;

import javafx.scene.layout.Pane;

public class Cloud {

    //each cloud is made up of exactly 4 bubbles, and so store them in array (instance variable)
    //take coordinate array as parameter - factory pattern as functionality same, just pos

    private Bubble[] bubbles;

    public Cloud(Pane cloudPane, int[][] coords){
        this.bubbles = new Bubble[Constants.NUMBER_BUBBLE];
        this.generateBubbles(cloudPane, coords);
    }

    private void generateBubbles(Pane pane, int[][] coords){
        for (int i = 0; i < this.bubbles.length; i++){
            int x = coords[i][0]; //i is the ith row in the coordinate array, and 0th column is x,
            // 1st
            // column
            // is y
            int y = coords[i][1];
            this.bubbles[i] = new Bubble(pane,x,y);
        }
    }

    public void moveRight(){
        for (Bubble bubble: this.bubbles){
            bubble.moveRight();
        }
    }

    public void moveLeft(){
        for (Bubble bubble: this.bubbles){
            bubble.moveLeft();
        }
    }

    public void moveUp(){
        for (Bubble bubble: this.bubbles){
            bubble.moveUp();
        }
    }

    public void moveDown(){
        for (Bubble bubble: this.bubbles){
            bubble.moveDown();
        }
    }
}
