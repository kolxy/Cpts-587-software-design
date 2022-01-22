# Homework 1

Xinyu Liu

Jan 2022

## 1 
Define class for **Circle** and **Rectangle***.
```java
public class Circle {
    double centerX;
    double centerY;

    public double[] getCenter() {
        return {centerX, centerY};
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Rectangle {
    double centerX;
    double centerY;

    public double[] getCenter() {
        return {centerX, centerY};
    }

    public double getArea() {
        return width * height;
    }
}

```

## 2
Define a **Shape** class
```java
public abstract class Shape {
    double centerX;
    double centerY;

    public abstract double getArea();

    /**
     * @return double[] center coordinates as [x, y]
     */
    public double[] getCenter() {
        return {centerX, centerY};
    }
}

public class Circle extends Shape {
    double radius;

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Rectangle extends Shape {
    double width;
    double height;

    public double getArea() {
        return width * height;
    }
}
```

The relationship is called inheritance. We need `Shape` class to generalize a lot of common attributes and abilities between `Circle` and `Rectangle`. For example, both circle and rectangle have center and getCenter, they can be written in `Shape` and subclass only need to inherit these properties by `extends`.

## 3
We cannot have an "unspecified" shape because `Shape` is an abstract class. It only generalizes the attributes of specific shape and cannot be instantiated by itself. 

## 4
