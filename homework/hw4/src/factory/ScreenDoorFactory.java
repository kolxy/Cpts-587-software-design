package factory;

import entity.ScreenDoorZombie;
import entity.Zombie;

public class ScreenDoorFactory implements ZombieFactory{
    @Override
    public Zombie create() {
        return new ScreenDoorZombie();
    }
}
