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

    /* assume there is a constructor defaults radius */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Rectangle extends Shape {
    double width;
    double height;

    /* assume there is a constructor defaults width and height */
    @Override
    public double getArea() {
        return width * height;
    }
}
```

The relationship is called inheritance. We need `Shape` class to generalize a lot of common attributes and abilities between `Circle` and `Rectangle`. For example, both circle and rectangle have center and getCenter, they can be written in `Shape` and subclass only need to inherit these properties by `extends`.

## 3
We cannot have an "unspecified" shape because `Shape` is an abstract class. It only generalizes the attributes of specific shape and cannot be instantiated by itself. 

## 4
Add `Style` to previous code.

```java
public class Style {
    // Notice these are public fields
    // I'm too lazy to write all the getters and setters
    public String color;
    public String fill;
    public int shades;
    public int outline;

    public Style() {
        // default style
        color = "white";
        fill = "black";
        shades = 1;
        outline = 1;
    }
}

public abstract class Shape {
    double centerX;
    double centerY;
    Style style;
    
    public Shape() {style = new Style();}

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

    /* assume there is a constructor defaults radius */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Rectangle extends Shape {
    double width;
    double height;

    /* assume there is a constructor defaults width and height */
    @Override
    public double getArea() {
        return width * height;
    }
}
```

Since all shapes have style, `Shape` can store the `Style` class.

## 5
Should Style be its own class? (Hint: yes). What is the relationship between Shape and Style in
your code/design?

Yes, as already written in **4**. Shape and style should be a composition relationship. Every shape must have a style (including default), but style cannot exist by itself. We could also say that there is a 1-to-1 association relationship because every shape only has one style.

## 6
`Canvas` class and `draw()` function.
```java
public abstract class Shape {
    /* previous declared fields and methods */

    public static Shape createShape(String shape) {
        if (shape == "circle") {
            return new Circle();
        } else if (shape == "rectangle") {
            return new Rectangle();
        }
    }

    /**
     * subclass draw its own shape
     */
    public abstract void draw(Canvas canvas);
}
public class Canvas {
    public List<Shape> shapeList;
    public void render() {
        // choose shape;
        String input = getUserInputShape();
        Shape s = Shape.createShape(input);
        // get x and y for coordinates
        int x = getUserInputX(); y = getUserInputY();
        s.centerX = x;
        s.centerY = y;
        shapeList.add(s);
        draw();
    }

    public void draw(Shape shape) {
        clearCanvas();
        for (Shape shape : shapeLiist) {
            shape.draw();
        }
    }
}
```

## 7
The relationship between `Canvas` and `Shape` should be 1-to-many association and composition where canvas contains shapes. `Canvas` contains a list of `Shape` whereas `Shape` only contains one instance of `Style` even though they both have composition relationship. 

When `Canvas` instance is deleted, all of its shapes `shapeList` should be deleted too. As mentioned in **5**, style cannot exist by itself. `Style` instances would also be deleted as they are stored in `Shape`.