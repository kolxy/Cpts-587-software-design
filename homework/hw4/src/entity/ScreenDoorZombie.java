package entity;

public class ScreenDoorZombie implements Zombie{
    private int hp;
    private Zombie zombie;

    public ScreenDoorZombie() {
        this.hp = 25;
        this.zombie = new RegularZombie();
    }

    @Override
    public Zombie takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0)
            return zombie.takeDamage(0 - hp);
        return this;
    }

    @Override
    public int getHp() {
        return this.hp + zombie.getHp();
    }

    @Override
    public String toString() {
        return "S/" + this.getHp();
    }
}