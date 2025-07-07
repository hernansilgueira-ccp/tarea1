import controller.GameController;
import factory.Enemy;
import factory.EnemyFactory;
import model.PlayerShip;
import strategy.DoubleShot;
import strategy.SingleShot;

public class Main {
    public static void main(String[] args) {
        // Singleton
        GameController game = GameController.getInstance();
        game.startGame();

        // Factory
        Enemy basic = EnemyFactory.createEnemy("basic");
        basic.display();

        Enemy advanced = EnemyFactory.createEnemy("advanced");
        advanced.display();

        // Strategy
        PlayerShip player = new PlayerShip(new SingleShot());
        player.attack();

        player.setStrategy(new DoubleShot());
        player.attack();
    }
}