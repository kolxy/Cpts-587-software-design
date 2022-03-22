# Homework 4
Xinyu Liu

Mar 2022

## 1
![class_diagram](https://raw.githubusercontent.com/kolxy/Cpts-587-software-design/master/homework/hw4/assets/fig1.png)

## 2
The program is using factory method pattern + composite pattern.
| Pattern | Class |
| --- | ----------- |
| Factory | ZombieFactory |
| Concrete Factory | RegularFactory, ConeFactory, BucketFactory, ScreenDoorFactory |
| Product | GameObject |
| Concrete Product | Zombie, Cone, Bucket, ScreenDoor |

| Pattern | Class |
| --- | ----------- |
| Component | GameObject |
| Leaf | Cone, Bucket, ScreenDoor |
| Composite | Zombie |

## 3 
In case IDE doesn't support the code, following are the UNIX commands needed to execute the program.
```bash
cd src/
javac Main.java
java Main
```
Please follow console prompt for correct input. This program cannot handle weird input.

## 4
In `takeDamage()`, take the remaining damage on the object itself after damaging all child objects.

## 5
Modify `takeDamage(int damage)` to `takeDamage(String damageType, int damage)`. In `ScreenDoor` class, if damage type is watermelon, simply return 0.

*takeDamage() returns remaining hp of the object*

*Please read the implementation to see how simply returning 0 will correctly output result while maintaining ScreenDoor object*