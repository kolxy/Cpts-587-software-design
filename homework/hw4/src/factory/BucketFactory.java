package factory;

import entity.BucketZombie;
import entity.Zombie;

public class BucketFactory implements ZombieFactory{
    @Override
    public Zombie create() {
        return new BucketZombie();
    }
}
