package entity;

public class ScreenDoorDecorator extends ZombieDecorator {
    public ScreenDoorDecorator(Zombie base) {
        super(base, 25);
    }

    @Override
    public void takeDamageAbove(int damage) {
        this.base.takeDamageAbove(damage);
    }

    @Override
    public boolean getMetalStatus() {
        return true;
    }

    @Override
    public String toString() {
        return "S/" + this.getHp();
    }
}
