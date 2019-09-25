package cecs277ipi.CECS277IPI;

/**
 * A center point
 * A radius (must be > 0)
 * @author Naveene Raya Carlos Alvarenga
 * @date 9/25/19
 */
public class Circle extends GeometricObject{
    
    private Point centerPt;
    private double radius;
    
     /**
     * constructs Circle object and its area and perimeter
     * @param centerPt_
     * @param radius_
     */
    public Circle(Point centerPt_, double radius_){
        centerPt = centerPt_;
        radius = radius_;
        area = Math.PI*radius*radius;
        perimeter = 2*Math.PI*radius;
    }
    
    /**
     *  returns Area of Circle
     * @return 
     */
    @Override
    public double Area(){
        return area;
    }
    
    /**
     * returns Perimeter of Circle
     * @return 
     */
    @Override
    public double Perimeter(){
        return perimeter;
    }
    
    /**
     * returns name and its radius, area, and perimeter as a string
     * @return 
     */
    @Override
    public String toString(){
        String str = "Circle: Center at:"+centerPt.toString()+" Radius: "+radius+" Area: "+area+" Perimeter: "+perimeter;
        return str;
    }
}
