package factory;

import entity.Cone;
import entity.GameObject;
import entity.Zombie;

public class ConeFactory implements ZombieFactory{
    @Override
    public GameObject create() {
        return new Zombie(new Cone());
    }
}
