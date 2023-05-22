public class Rectangle extends Shape {
    double x1 = 0.0;
    double x2 = 5.0;
    double x3 = 5.0;
    double y1 = 0.0;
    double y2 = 0.0;
    double y3 = 8.0;

    double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
     double side2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null|| this.getClass() != obj.getClass())
            return  false;
        Rectangle rec = (Rectangle) obj;
        if (this.side1 != rec.side1)
            return false;
        return (this.side2 == rec.side2);
    }
    @Override
    public int hashcode(){
        int result = 40;
        result = 20 * result + (int)(Double.doubleToLongBits(side1)>>>32);
        result = 20 * result + (int)(Double.doubleToLongBits(side2)>>>32);
        return result;
    }
    @Override
    public double calculatePerimeter(){
        double perimeter = (side1 + side2) * 2; // Calculate Perimeter of Rectangle
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area = side1 * side2;// Calculate Area of Rectangle
        return area;
    }
    @Override
    public String paint(String color){
        this.color = color;
        return color;
    }
}





