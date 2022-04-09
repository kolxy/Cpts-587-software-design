package factory;

import entity.Zombie;
import manager.GameObjectManager;

public interface ZombieFactory {
    public Zombie create(GameObjectManager gom);
}
