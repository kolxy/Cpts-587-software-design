package entity;

public class Cone implements GameObject{
    private int hp;
    private String name;

    public Cone() {
        this.hp = 25;
        name = "C";
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
