import entity.Zombie;
import factory.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Zombie> zombieList = new ArrayList<>();
    public static ZombieFactory[] factories;

    public static void main(String[] args) {
        // Lazy initialization, index = type
        factories = new ZombieFactory[]{null, new RegularFactory(), new ConeFactory(), new BucketFactory(), new ScreenDoorFactory()};
        boolean loop = true;
        Scanner in = new Scanner(System.in);
        while (loop) {
            System.out.println("===== Main Menu =====");
            System.out.println("1. Create Zombie");
            System.out.println("2. Demo gameplay");
            System.out.println("3. Quit");
            System.out.println("Current line-up: " + getZombieInfo());
            System.out.print("Command: ");
            int command = in.nextInt();
            switch(command) {
                case 1:
                    createZombie(in);
                    break;
                case 2:
                    loop = false;
                    break;
                case 3:
                    System.exit(0);
            }
        }
        demo(in);
        System.out.println("Game over");
    }

    /**
     * Create zombie
     * @param in Scanner
     */
    public static void createZombie(Scanner in) {
        System.out.println("Which kind?");
        System.out.println("1. Regular");
        System.out.println("2. Cone");
        System.out.println("3. Bucket");
        System.out.println("4. ScreenDoor");
        System.out.print("Choose type: ");
        int type = in.nextInt();
        zombieList.add(factories[type].create());
    }

    /**
     * Update first zombie in the list by taking damage
     * If zombie dies, remove from the list
     * @param in Scanner
     */
    public static void demo(Scanner in) {
        System.out.println("Please enter damage value.");
        int damage = in.nextInt();
        int round = 0;
        System.out.println("Round " + round + ": " + getZombieInfo());
        while (!zombieList.isEmpty()) {
            // Front zombie take damage
            Zombie zombie = zombieList.remove(0).takeDamage(damage);
            if (zombie != null) { // Zombie still alive
                zombieList.add(0, zombie);
            }
            round++;
            System.out.println("Round " + round + ": " + getZombieInfo());
        }
    }

    /**
     * Print every zombie in the list
     * @return
     */
    public static String getZombieInfo() {
        return Arrays.toString(zombieList.toArray());
    }
}
