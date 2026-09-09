class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape");
    }
    public void erase() {
        System.out.println("Erasing a generic shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    public void erase() {
        System.out.println("Erasing a Circle");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
    public void erase() {
        System.out.println("Erasing a Triangle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
    public void erase() {
        System.out.println("Erasing a Square");
    }
}

public class Ques9 {
    public static void main(String[] args) {
        Shape myShape; // Parent reference variable

        myShape = new Circle();
        myShape.draw();
        myShape.erase();
        System.out.println("---");

        myShape = new Triangle();
        myShape.draw();
        myShape.erase();
        System.out.println("---");

        myShape = new Square();
        myShape.draw();
        myShape.erase();
    }
}
