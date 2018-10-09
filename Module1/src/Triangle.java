import Shape.Shape;

public class Triangle extends Shape {

    public Triangle(){
    }
    public Triangle(double side1,double side2,double side3){
        super(side1,side2,side3);
    }
    public double getPerimeter(){
     return getSide1()+getSide2()+getSide3();
    }
    public double getArea(){
        double perimeter = getPerimeter()/2;
        return Math.sqrt(perimeter* (perimeter-getSide1()) * (perimeter-getSide2()) * (perimeter-getSide3()) );
    }
}
