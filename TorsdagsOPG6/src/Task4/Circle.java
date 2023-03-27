package Task4;

public class Circle implements Shape {

    double radius;
    double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return(pi*radius*radius);
    }

    public String toString(){
        return ("Circle arel er: " + getArea());
    }

}
