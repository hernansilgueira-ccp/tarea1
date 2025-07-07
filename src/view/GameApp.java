package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        GameView gameView = new GameView();

        Scene scene = new Scene(gameView.getRoot(), 600, 400);
        primaryStage.setTitle("Space Invaders - JavaFX Edition");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
