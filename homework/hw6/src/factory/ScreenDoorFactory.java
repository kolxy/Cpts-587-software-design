package factory;

import entity.BucketDecorator;
import entity.RegularZombie;
import entity.ScreenDoorDecorator;
import entity.Zombie;
import manager.GameObjectManager;

public class ScreenDoorFactory implements ZombieFactory{
    @Override
    public Zombie create(GameObjectManager gom) {
        Zombie base = new RegularZombie();
        base.addListener(gom);
        Zombie screendoor = new ScreenDoorDecorator(base);
        screendoor.addListener(gom);
        return screendoor;
    }
}
