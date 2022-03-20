package factory;

import entity.ConeZombie;
import entity.Zombie;

public class ConeFactory implements ZombieFactory{
    @Override
    public Zombie create() {
        return new ConeZombie();
    }
}
