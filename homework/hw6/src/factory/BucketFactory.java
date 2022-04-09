package factory;

import entity.BucketDecorator;
import entity.RegularZombie;
import entity.Zombie;
import manager.GameObjectManager;

public class BucketFactory implements ZombieFactory{
    @Override
    public Zombie create(GameObjectManager gom) {
        Zombie base = new RegularZombie();
        base.addListener(gom);
        Zombie bucket = new BucketDecorator(base);
        bucket.addListener(gom);
        return bucket;
    }
}
