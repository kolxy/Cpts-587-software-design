package entity;

public interface GameObject {
    /**
     * Return remaining hp
     * @param damage
     * @return
     */
    public int takeDamage(int damage);

    /**
     * Calculates current hp
     * @return
     */
    public int getHp();

    /**
     * Get Object name for printing purpose
     * ex. "R" for Regular, "C" for Cone
     * @return
     */
    public String getName();
}