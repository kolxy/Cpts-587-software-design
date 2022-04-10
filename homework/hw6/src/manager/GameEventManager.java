package manager;

import entity.Zombie;

public class GameEventManager {
    private GameObjectManager gom;

    public GameEventManager(GameObjectManager gom) {
        this.gom = gom;
    }

    /**
     * Deal damage as peashooter
     * @param zombie
     * @param damage
     */
    public void doDamage(Zombie zombie, int damage) {
        zombie.takeDamage(damage);
    }

    /**
     * Deal damage as watermelon
     * @param zombie
     * @param damage
     */
    public void doDamageAbove(Zombie zombie, int damage) {
        zombie.takeDamageAbove(damage);
    }

    /**
     * Remove metal parts with magnet-shroom
     * @param zombie
     */
    public void applyMagnetForce(Zombie zombie) {
        if (zombie.getMetalStatus()) {
            zombie.die();
        }
    }

    public void simulateCollisionDetection(int type) {
        Zombie zombie = gom.getNearest();
        switch(type) {
            case 1:
                doDamage(zombie, 25);
                break;
            case 2:
                doDamageAbove(zombie, 40);
                break;
            case 3:
                applyMagnetForce(zombie);
                break;
        }
    }
}
