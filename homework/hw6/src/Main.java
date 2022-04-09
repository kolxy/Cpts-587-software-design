import factory.*;
import manager.GameEventManager;
import manager.GameObjectManager;

import java.util.Scanner;

public class Main {
    public static GameEventManager gem;
    public static GameObjectManager gom;
    public static ZombieFactory[] factories;
    public static Scanner in;

    public static void main(String[] args) {
        gom = new GameObjectManager();
        gem = new GameEventManager(gom);
        factories = new ZombieFactory[]{null, new RegularFactory(), new ConeFactory(), new BucketFactory(), new ScreenDoorFactory()};
        in = new Scanner(System.in);

        boolean end = false;
        while (!end) {
            System.out.println("\n========== Main Menu ==========");
            System.out.println("1. Create Zombie");
            System.out.println("2. Demo gameplay");
            System.out.println("3. Quit");
            System.out.println("Current line-up: " + gom.getZombieInfo());
            System.out.print("Command: ");
            int command = in.nextInt();
            switch(command) {
                case 1:
                    createZombie();
                    break;
                case 2:
                    end = true;
                    break;
                case 3:
                    System.exit(0);
            }
        }
        startGame();
        System.out.println("Game over");
    }

    public static void createZombie() {
        System.out.println("Which kind?");
        System.out.println("1. Regular");
        System.out.println("2. Cone");
        System.out.println("3. Bucket");
        System.out.println("4. ScreenDoor");
        System.out.print("Choose type: ");
        int type = in.nextInt();
        gom.addZombie(factories[type].create(gom));
    }

    public static void startGame() {
        while(true) {
            System.out.println("Choose attack type:");
            System.out.println("1. Peashooter");
            System.out.println("2. Watermelon");
            System.out.println("3. Magnet-shroom");
            System.out.println("4. End");

            int type = in.nextInt();
            if (type == 4) {
                return;
            }
            gem.simulateCollisionDetection(type);
            System.out.println("Current line-up: " + gom.getZombieInfo());
        }

    }
}
