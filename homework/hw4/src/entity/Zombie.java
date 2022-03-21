package entity;

public interface Zombie {
    /**
     * Return the damaged Zombie, null if the zombie dies
     * @param damage
     * @return
     */
    public Zombie takeDamage(int damage);

    /**
     * Calculates current hp
     * @return
     */
    public int getHp();

    /**
     * Format for print
     * @return
     */
    public String toString();
}