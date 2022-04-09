package entity;

public class BucketDecorator extends ZombieDecorator {

    public BucketDecorator(Zombie base) {
        super(base, 100);
    }

    @Override
    public boolean getMetalStatus() {
        return true;
    }

    @Override
    public String toString() {
        return "B/" + this.getHp();
    }
}
