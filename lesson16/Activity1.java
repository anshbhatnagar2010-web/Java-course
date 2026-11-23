package lesson16;
interface Shape { 
double getArea(); 
} 
class Rectangle implements Shape 
{ 
    private double width; 
    private double height; 
    public Rectangle(double width, double height) { 
        this.width = width; 
        this.height = height; 
        } 
    public double getArea() { 
        return width * height; 
        } 
    } 
    class Circle implements Shape { 
        private double radius; 
        public Circle(double radius) { 
            this.radius = radius; 
        } public double getArea() { 
            return Math.PI * radius * radius; 
        } 
    } 
    class AreaCalculator { 
        public double sumAreas(Shape[] shapes) { 
            double totalArea = 0; 
            for (Shape shape : shapes) { 
                totalArea += shape.getArea(); 
            } return totalArea; 
        } 
    } 

    public class Activity1 {
        public static void main (String []args){
            Rectangle a = new Rectangle(5,5);
            Rectangle b = new Rectangle(10,5);
            Circle c = new Circle(2);
            Circle d = new Circle(5);
            Shape[] shapes={a,b,c,d};
            AreaCalculator calculator = new AreaCalculator();
            System.out.println("Total Area: "+calculator.sumAreas(shapes));
        }
    }