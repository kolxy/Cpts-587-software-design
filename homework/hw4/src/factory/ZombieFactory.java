package factory;

import entity.Zombie;

public interface ZombieFactory {
    /**
     *
     * @return a Zombie
     */
    public Zombie create();
}
