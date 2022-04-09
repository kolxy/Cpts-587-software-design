package entity;

public class ConeDecorator extends ZombieDecorator {

    public ConeDecorator(Zombie base) {
        super(base, 25);
    }

    @Override
    public boolean getMetalStatus() {
        return false;
    }

    @Override
    public String toString() {
        return "C/" + this.getHp();
    }
}
