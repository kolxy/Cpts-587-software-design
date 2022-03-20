package entity;

public class ScreenDoorZombie extends Zombie{

    public ScreenDoorZombie() {
        this.hp = 25;
        this.zombie = new RegularZombie();
    }

    public String toString() {
        return "S/" + this.getHp();
    }
}
