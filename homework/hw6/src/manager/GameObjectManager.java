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

    public void addZombie(Zombie zombie) {
        objectList.add(zombie);
    }

    public void update(Zombie newZombie) {
        if (newZombie == null) {
            objectList.remove(0);
        } else {
            objectList.set(0, newZombie);
        }
    }

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
