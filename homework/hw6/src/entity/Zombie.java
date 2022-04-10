package entity;

import manager.GameObjectManager;

public interface Zombie {
    /**
     * Take peashooter damage
     * @param damage
     */
    public void takeDamage(int damage);

    /**
     * Take watermelon damage
     * @param damage
     */
    public void takeDamageAbove(int damage);

    /**
     * Object dies, update GOM list
     */
    public void die();

    /**
     * return total hp of the zombie
     * @return
     */
    public int getHp();

    /**
     * Check if Zombie has metal parts
     * @return
     */
    public boolean getMetalStatus();

    /**
     * GOM subscribe to Zombie
     * @param gom
     */
    public void addListener(GameObjectManager gom);
}
