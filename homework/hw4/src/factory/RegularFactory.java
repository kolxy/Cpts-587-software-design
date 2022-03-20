package factory;

import entity.RegularZombie;
import entity.Zombie;

public class RegularFactory implements ZombieFactory{
    @Override
    public Zombie create() {
        return new RegularZombie();
    }
}
