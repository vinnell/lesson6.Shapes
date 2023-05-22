public class Circle extends Shape {
    double x1 = 0.0;
    double x2 = 5.0;
    double y1 = 0.0;
    double y2 = 0.0;

    double radius = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null|| this.getClass() != obj.getClass())
            return  false;
        Circle circle = (Circle) obj;
        if (this.radius != circle.radius)
            return false;
        return (this.radius == circle.radius);
    }
    @Override
    public int hashcode(){
        int result = 30;
        result = 40 * result + (int)(Double.doubleToLongBits(radius)>>>32);
        return result;
    }
    @Override
    public double calculatePerimeter(){
        double perimeter = 2 * Math.PI * radius; // Calculate Perimeter of circle
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius; // Calculate area of circle
        return area;
    }
    @Override
    public String paint(String color){
        this.color = color;
        return color;
    }
}

