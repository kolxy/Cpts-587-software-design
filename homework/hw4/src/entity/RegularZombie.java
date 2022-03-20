package entity;

public class RegularZombie extends Zombie {
    public RegularZombie() {
        this.hp = 50;
    }

    public String toString() {
        return "R/" + this.getHp();
    }
}
