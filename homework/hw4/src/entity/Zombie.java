package entity;

public abstract class Zombie {
    int hp;
    Zombie zombie;

    /**
     * Get total hp of current zombie
     * @return
     */
    public int getHp() {
        if (zombie == null) {
            return hp;
        }
        return hp + zombie.getHp();
    }

    /**
     * Calculates hp after being damaged. Null if zombie is dead.
     * @param damage
     * @return damaged zombie
     */
    public Zombie takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) { // Composite dies
            if (zombie == null) {
                return null;
            } else { // carry over damage
                return zombie.takeDamage(0 - hp);
            }
        }
        return this;
    }
}
