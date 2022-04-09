package entity;

import factory.RegularFactory;
import manager.GameObjectManager;

public class RegularZombie implements Zombie {
    int hp;
    GameObjectManager gom;

    public RegularZombie() {
        this.hp = 50;
    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            die();
        }
    }

    @Override
    public void takeDamageAbove(int damage) {
        this.takeDamage(damage);
    }

    @Override
    public void die() {
        gom.update(null);
    }

    @Override
    public int getHp() {
        return Math.max(this.hp, 0);
    }

    @Override
    public boolean getMetalStatus() {
        return false;
    }

    @Override
    public void addListener(GameObjectManager gom) {
        this.gom = gom;
    }

    @Override
    public String toString() {
        return "R/" + this.getHp();
    }
}
