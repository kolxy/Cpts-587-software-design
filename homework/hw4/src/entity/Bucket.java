package entity;

public class Bucket implements GameObject {
    private int hp;
    private String name;

    public Bucket() {
        this.hp = 100;
        this.name = "B";
    }

    @Override
    public int takeDamage(int damage) {
        hp = Math.max(hp - damage, 0);
        return hp;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
