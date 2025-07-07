package model;

import strategy.ShootingStrategy;

public class PlayerShip {
    private ShootingStrategy strategy;

    public PlayerShip(ShootingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ShootingStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        strategy.shoot();
    }
}