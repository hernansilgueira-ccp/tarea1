package controller;

public class GameController {
    private static GameController instance;

    private GameController() {
        System.out.println("GameController iniciado...");
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public void startGame() {
        System.out.println("El juego ha comenzado...");
    }
}