package factory;

import entity.GameObject;
import entity.ScreenDoor;
import entity.Zombie;

public class ScreenDoorFactory implements ZombieFactory{
    @Override
    public GameObject create() {
        return new Zombie(new ScreenDoor());
    }
}
