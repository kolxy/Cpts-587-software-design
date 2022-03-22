package factory;

import entity.GameObject;

public interface ZombieFactory {
    /**
     *
     * @return a GameObject
     */
    public GameObject create();
}
