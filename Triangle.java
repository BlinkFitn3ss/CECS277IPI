package cecs277ipi.CECS277IPI;

/**
 *
 * @author Naveene Raya Carlos Alvarenga
 * @date 9/18/19 
 */
public class Triangle {
    
    /**
     *
     * @param p1
     * @param p2
     * @param p3
     */
    Point p1;
    Point p2;
    Point p3;
    
    double sideA;
    double sideB;
    double sideC;
    
    // the class has the following member variables which will be used in the toString() method.
    double area;
    double perimeter;
    
    // constructor calculates 'area' and'perimeter' and stores them in class member variables.
    public Triangle(Point p1_, Point p2_, Point p3_){
        p1 = p1_;
        p2 = p2_;
        p3 = p3_;
        sideA = p1.distance(p2);
        sideB = p2.distance(p3);
        sideC = p3.distance(p1);
        
        double s = (sideA+sideB+sideC)/2.0;
        area = sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        perimeter = sideA+sideB+sideC;

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
        String str = "Triangle: "+p1.toString()+", "+p2.toString+", "+p3.toString+" Area: "+area+" Perimeter: "+perimeter;
        return str;
    }
    
}
