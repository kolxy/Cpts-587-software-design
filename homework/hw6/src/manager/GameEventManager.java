package manager;

import entity.Zombie;

public class GameEventManager {
    private GameObjectManager gom;
    public GameEventManager(GameObjectManager gom) {
        this.gom = gom;
    }

    public void doDamage(Zombie zombie, int damage) {
        zombie.takeDamage(damage);
    }

    public void doDamageAbove(Zombie zombie, int damage) {
        zombie.takeDamageAbove(damage);
    }

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
