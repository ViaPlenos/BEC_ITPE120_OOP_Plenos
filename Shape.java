public class Shape {
    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            System.out.println(shape + " - Area: " + shape.calculateArea() + ", Perimeter: " + shape.calculatePerimeter());
        }
    }

    public enum Shape {
        CIRCLE {
            @Override
            public double calculateArea() {
                double radius = 5.0; 
                return Math.PI * radius * radius;
            }

            @Override
            public double calculatePerimeter() {
                double radius = 5.0; 
                return 2 * Math.PI * radius;
            }
        },
        SQUARE {
            @Override
            public double calculateArea() {
                double sideLength = 4.0; 
                return sideLength * sideLength;
            }

            @Override
            public double calculatePerimeter() {
                double sideLength = 4.0;
                return 4 * sideLength;
            }
        },
        TRIANGLE {
            @Override
            public double calculateArea() {
                double base = 6.0; 
                double height = 4.0; 
                return 0.5 * base * height;
            }

            @Override
            public double calculatePerimeter() {
                double side1 = 3.0;
                double side2 = 4.0; 
                double side3 = 5.0; 
                return side1 + side2 + side3;
            }
        };

        public abstract double calculateArea();
        public abstract double calculatePerimeter();
    }
}
