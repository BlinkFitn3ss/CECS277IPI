package cecs277ipi.CECS277IPI;

/**
 *
 * @author Naveene Raya Carlos Alvarenga
 * @date 9/25/19 
 */
public class Triangle extends GeometricObject{
    
    private Point p1;
    private Point p2;
    private Point p3;  
    private double sideA;
    private double sideB;
    private double sideC;
    
    /**
     * constructs triangle object and calculates its area and perimeter
     * @param p1_
     * @param p2_
     * @param p3_
     */
    public Triangle(Point p1_, Point p2_, Point p3_){
        p1 = p1_;
        p2 = p2_;
        p3 = p3_;
        sideA = p1.distance(p2);
        sideB = p2.distance(p3);
        sideC = p3.distance(p1);
        
        double s = (sideA+sideB+sideC)/2.0;
        area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        perimeter = sideA+sideB+sideC;

    }
    
    /**
     * returns area
     * @return
     */
    @Override
    public double Area(){
        return area;
    }
    
    /**
     * returns perimeter
     * @return 
     */
    @Override
    public double Perimeter(){
        return perimeter;
    }
    
    /**
     * returns object name and specifications 
     * @return 
     */
    @Override
    public String toString(){
        String str = "Triangle: "+p1.toString()+", "+p2.toString()+", "+p3.toString()+" Area: "+area+" Perimeter: "+perimeter;
        return str;
    }
    
}
