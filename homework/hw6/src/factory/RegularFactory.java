package factory;

import entity.BucketDecorator;
import entity.RegularZombie;
import entity.Zombie;
import manager.GameObjectManager;

public class RegularFactory implements ZombieFactory {
    @Override
    public Zombie create(GameObjectManager gom) {
        Zombie base = new RegularZombie();
        base.addListener(gom);
        return base;
    }
}
