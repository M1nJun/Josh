package edu.lawrence.grid;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        
        Scene scene = new Scene(grid, 400, 400);
        
        stage.setTitle("Grid Click");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}