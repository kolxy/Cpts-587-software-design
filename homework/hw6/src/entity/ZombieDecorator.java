package entity;

import manager.GameObjectManager;

public abstract class ZombieDecorator implements Zombie {
    Zombie base;
    int hp;
    GameObjectManager gom;

    public ZombieDecorator(Zombie base, int hp) {
        this.base = base;
        this.hp = hp;
    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            die();
        }
        int leftOver = Math.max(0 - hp, 0);
        if (leftOver > 0) {
            base.takeDamage(leftOver);
        }
    }

    @Override
    public void takeDamageAbove(int damage) {
        this.takeDamage(damage);
    }

    @Override
    public void addListener(GameObjectManager gom) {
        this.gom = gom;
    }

    @Override
    public void die() {
        gom.update(base);
    }

    @Override
    public int getHp() {
        return Math.max(this.hp, 0) + base.getHp();
    }
}
