package entity;

public class ScreenDoor implements GameObject {
    private int hp;
    private String name;

    public ScreenDoor() {
        this.hp = 25;
        this.name = "S";
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
