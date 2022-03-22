package factory;

import entity.Bucket;
import entity.GameObject;
import entity.Zombie;

public class BucketFactory implements ZombieFactory{
    @Override
    public GameObject create() {
        return new Zombie(new Bucket());
    }
}
