public class Triangle extends Shape {
    double x1 = 1.0;
    double x2 = 3.0;
    double x3 = 5.0;
    double y1 = 2.0;
    double y2 = -1.0;
    double y3 = 5.0;

    double side1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    double side2 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
    double side3 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

   @Override
    public int hashcode(){
        int result = 22;
        result = 50 * result + (int)(Double.doubleToLongBits(side1)>>>32);
        result = 50 * result + (int)(Double.doubleToLongBits(side2)>>>32);
        result = 50 * result + (int)(Double.doubleToLongBits(side3)>>>32);
        return result;
    }
    @Override
    public double calculatePerimeter(){
    double perimeter = side1 + side2 + side3; // Calculate Perimeter of triangle
        return perimeter;
    }

   @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));// Calculate Area of triangle
     return area;
    }
    @Override
    public String paint(String color){
       this.color = color;
        return color;
    }
}

