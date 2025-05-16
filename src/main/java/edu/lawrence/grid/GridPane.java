package edu.lawrence.grid;

import java.util.ArrayList;
import javafx.scene.layout.Pane;

public class GridPane extends Pane {
    private ArrayList<GridCell> rects;
    
    public GridPane() {
        rects = new ArrayList();
        double w = 40;
        double h = 40;
                
        for(int row = 0;row < 10;row++) {
            for(int col = 0;col < 10;col++) {
                double x = row * w;
                double y = col * h;
                GridCell r = new GridCell(x,y,w,h);
                rects.add(r);
                this.getChildren().add(r.getShape());
            }
        }
        this.setOnMousePressed(e->click(e.getX(),e.getY()));
    }
    
    private void click(double x,double y) {
        for(GridCell cell : rects) {
            if(cell.containsPoint(x, y))
                cell.click();
        }
    }   
}
