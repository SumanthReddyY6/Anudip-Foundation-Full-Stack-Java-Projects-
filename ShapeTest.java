package inheritance;

	// Abstract class Shape
	abstract class Shape {
	    // Abstract method to calculate the area
	    public abstract double getArea();
	}

	// Subclass Circle
	class Circle extends Shape {
	    private int radius;

	    // Constructor to initialize the radius
	    public Circle(int radius) {
	        this.radius = radius;
	    }

	    // Override getArea() method for Circle
	    @Override
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	}

	// Subclass Square
	class Square extends Shape {
	    private int length;

	    // Constructor to initialize the length
	    public Square(int length) {
	        this.length = length;
	    }

	    // Override getArea() method for Square
	    @Override
	    public double getArea() {
	        return length * length;
	    }
	}

	// Subclass Rectangle
	class Rectangle extends Shape {
	    private int width;
	    private int height;

	    // Constructor to initialize the width and height
	    public Rectangle(int width, int height) {
	        this.width = width;
	        this.height = height;
	    }

	    // Override getArea() method for Rectangle
	    @Override
	    public double getArea() {
	        return width * height;
	    }
	}

	// Main class to test the program
	public class ShapeTest {
	    public static void main(String[] args) {
	        // Create objects of Circle, Square, and Rectangle
	        Shape circle = new Circle(6);
	        Shape square = new Square(8);
	        Shape rectangle = new Rectangle(6, 7);

	        // Print the areas
	        System.out.println("Area of Circle: " + circle.getArea());
	        System.out.println("Area of Square: " + square.getArea());
	        System.out.println("Area of Rectangle: " + rectangle.getArea());
	    }
	}

