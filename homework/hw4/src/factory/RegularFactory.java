package factory;

import entity.GameObject;
import entity.Zombie;

public class RegularFactory implements ZombieFactory{
    @Override
    public GameObject create() {
        return new Zombie();
    }
}
