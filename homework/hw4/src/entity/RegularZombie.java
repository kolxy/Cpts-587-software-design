package entity;

public class RegularZombie implements Zombie {
    private int hp;
    public RegularZombie() {
        this.hp = 50;
    }

    @Override
    public Zombie takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0)
            return null;
        return this;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public String toString() {
        return "R/" + this.getHp();
    }
}
