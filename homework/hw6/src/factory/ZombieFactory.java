package factory;

import entity.Zombie;
import manager.GameObjectManager;

public interface ZombieFactory {
    /**
     * Create Zombie and make GOM as listener
     * @param gom
     * @return
     */
    public Zombie create(GameObjectManager gom);
}
