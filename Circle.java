package cecs277ipi.CECS277IPI;

/**
 * A center point
 * A radius (must be > 0)
 * @author Naveene Raya Carlos Alvarenga
 * @date 9/18/19
 */
public class Circle {
    
    /**
     *
     * @param centerPt
     */
    
    final double PI = 3.14159;
    
    Point centerPt;
    double radius;
    
    // the class has the following member variables which will be used in the toString() method.
    double area;
    double perimeter;
    
    // constructor calculates 'area' and'perimeter' and stores them in class member variables.
    public Circle(Point centerPt_, double radius_){
        centerPt = centerPt_;
        radius = radius_;
        area = PI*radius*radius;
        perimeter = 2*PI*radius;
    }
    
    @Override
    public double Area(){
        return area;
    }
    
    @Override
    public double Perimeter(){
        return perimeter;
    }
    
    @Override
    public String toString(){
        String str = "Circle: Center at:"+centerPt.toString()+" Radius: "+radius+" Area: "+area+" Perimeter: "+perimeter;
    }
}
