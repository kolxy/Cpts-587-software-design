package entity;

import manager.GameObjectManager;

public interface Zombie {
    public void takeDamage(int damage);
    public void takeDamageAbove(int damage);
    public void die();
    public int getHp();
    public boolean getMetalStatus();
    public void addListener(GameObjectManager gom);
}
