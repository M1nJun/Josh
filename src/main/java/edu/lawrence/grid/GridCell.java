package edu.lawrence.grid;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class GridCell {
    private Rectangle rectangle;
    private int clickCount;
    
    public GridCell(double x,double y,double w,double h) {
        rectangle = new Rectangle(x,y,w,h);
        rectangle.setFill(Color.GREEN);
        rectangle.setStroke(Color.BLACK);
        clickCount = 0;
    }
    
    public Shape getShape() {
        return rectangle;
    }
    
    public boolean containsPoint(double x,double y) {
        return rectangle.contains(x,y);
    }
    
    public void click() {
        clickCount++;
        if(clickCount == 1)
            rectangle.setFill(Color.YELLOW);
        else
            rectangle.setFill(Color.RED);
    }
}
