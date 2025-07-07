package view;

import controller.GameController;
import factory.Enemy;
import factory.EnemyFactory;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import model.PlayerShip;
import strategy.DoubleShot;
import strategy.SingleShot;

public class GameView {
    private VBox root;
    private Label gameStatus;
    private Label enemyStatus;
    private Label playerStatus;
    private PlayerShip player;

    public GameView() {
        root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        gameStatus = new Label("Presiona 'Iniciar Juego'");
        enemyStatus = new Label("");
        playerStatus = new Label("");

        Button startButton = new Button("Iniciar Juego");
        startButton.setOnAction(e -> {
            GameController.getInstance().startGame();
            gameStatus.setText("Juego Iniciado");
        });

        Button enemyButton = new Button("Crear Enemigo Básico");
        enemyButton.setOnAction(e -> {
            Enemy enemy = EnemyFactory.createEnemy("basic");
            enemyStatus.setText("Se creó: Enemigo Básico");
        });

        Button shootSingle = new Button("Disparo Simple");
        shootSingle.setOnAction(e -> {
            player.setStrategy(new SingleShot());
            player.attack();
            playerStatus.setText("Estrategia: Disparo simple");
        });

        Button shootDouble = new Button("Disparo Doble");
        shootDouble.setOnAction(e -> {
            player.setStrategy(new DoubleShot());
            player.attack();
            playerStatus.setText("Estrategia: Disparo doble");
        });

        player = new PlayerShip(new SingleShot());

        root.getChildren().addAll(
                gameStatus, enemyStatus, playerStatus,
                startButton, enemyButton,
                shootSingle, shootDouble
        );
    }

    public VBox getRoot() {
        return root;
    }
}
