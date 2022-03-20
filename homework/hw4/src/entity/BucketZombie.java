package entity;

public class BucketZombie extends Zombie{
    public BucketZombie() {
        this.hp = 100;
        this.zombie = new RegularZombie();
    }

    public String toString() {
        return "B/" + this.getHp();
    }
}
