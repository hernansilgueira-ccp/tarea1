package factory;

public class EnemyFactory {
    public static Enemy createEnemy(String type) {
        switch (type) {
            case "basic":
                return new BasicEnemy();
            case "advanced":
                return new AdvancedEnemy();
            default:
                throw new IllegalArgumentException("Tipo desconocido: " + type);
        }
    }
}