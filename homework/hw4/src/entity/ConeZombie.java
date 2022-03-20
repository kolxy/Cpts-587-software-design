package entity;

public class ConeZombie extends Zombie{
    public ConeZombie() {
        this.hp = 25;
        this.zombie = new RegularZombie();
    }

    public String toString() {
        return "C/" + this.getHp();
    }
}
