public class Circle {
        private static final double PI = 3.14159; // static final variable
        private double radius; // instance variable
    
        public Circle(double radius) {
            this.radius = radius;
        }
    
        public static double calculateArea(double radius) {
            return PI * radius * radius; // static method using static variable
        }
    
        public double calculateCircumference() {
            return 2 * PI * radius; // instance method using static variable
        }
    
        public static void main(String[] args) {
            double radius = 5.0;
            Circle circle = new Circle(radius);
    
            double area = Circle.calculateArea(radius); // calling static method
            double circumference = circle.calculateCircumference(); // calling instance method
    
            System.out.println("Area: " + area); // Output: Area: 78.53975
            System.out.println("Circumference: " + circumference); // Output: Circumference: 31.4159
        }
    }

