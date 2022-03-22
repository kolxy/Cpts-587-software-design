package entity;

import java.util.ArrayList;
import java.util.List;

public class Zombie implements GameObject{
    private int hp;
    private List<GameObject> objectList;
    private String name = "R";

    public Zombie() {
        hp = 50;
        objectList = new ArrayList<>();
    }

    public Zombie(GameObject object) {
        this();
        objectList.add(object);
    }

    @Override
    public int takeDamage(int damage) {
        int remainDamage = damage;
        List<GameObject> removeList = new ArrayList<>();
        for (GameObject obj : objectList) {
            remainDamage -= obj.getHp() - obj.takeDamage(remainDamage);
            if (obj.getHp() == 0) { // remove dead object
                removeList.add(obj);
            }
        }
        objectList.removeAll(removeList);
        this.hp -= Math.max(remainDamage, 0);
        return Math.max(this.hp, 0);
    }

    @Override
    public int getHp() {
        int total = hp;
        for (GameObject obj : objectList) {
            total += obj.getHp();
        }
        return total;
    }

    @Override
    public String getName() {
        if (objectList.isEmpty()) {
            return this.name;
        }
        return objectList.get(0).getName();
    }


    public String toString() {
        return this.getName() + "/" + this.getHp();
    }
}
