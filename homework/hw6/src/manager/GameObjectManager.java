package manager;

import entity.Zombie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameObjectManager {

    private List<Zombie> objectList;

    public GameObjectManager() {
        objectList = new ArrayList<>();
    }

    /**
     * Add zombie to the roster
     * @param zombie
     */
    public void addZombie(Zombie zombie) {
        objectList.add(zombie);
    }

    /**
     * Update the status of the nearest zombie
     * Happens on Zombie.die()
     * @param newZombie
     */
    public void update(Zombie newZombie) {
        if (newZombie == null) {
            objectList.remove(0);
        } else {
            objectList.set(0, newZombie);
        }
    }

    /**
     * return the first zombie
     * @return Zombie
     */
    public Zombie getNearest() {
        return objectList.get(0);
    }

    /**
     * Print every zombie in the list
     * @return
     */
    public String getZombieInfo() {
        return Arrays.toString(objectList.toArray());
    }
}
