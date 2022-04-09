package factory;

import entity.BucketDecorator;
import entity.ConeDecorator;
import entity.RegularZombie;
import entity.Zombie;
import manager.GameObjectManager;

public class ConeFactory implements ZombieFactory {
    @Override
    public Zombie create(GameObjectManager gom) {
        Zombie base = new RegularZombie();
        base.addListener(gom);
        Zombie cone = new ConeDecorator(base);
        cone.addListener(gom);
        return cone;
    }
}
