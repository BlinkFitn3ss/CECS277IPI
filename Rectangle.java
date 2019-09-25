package cecs277ipi.CECS277IPI;


/**
 * Location of the upper left corner
 * Width (must be > 0)
 * Length (must be > 0)
 * @author Naveene Raya Carlos Alvarenga
 * @date 9/25/19
 */
public class Rectangle extends GeometricObject {
    
    Point upperLeftPt;
    double width;
    double length;
    
    /**
     * constructs rectangle object and calculates its area and perimeter
     * @param upperLeftPt_
     * @param width_
     * @param length_
     */
    public Rectangle(Point upperLeftPt_, double width_, double length_){
        upperLeftPt = upperLeftPt_;
        if(width_ <= 0)
            width = 1;
        else
            width = width_;
        if(length_ <= 0)
            length = 1;
        else
            length = length_;
        area = width*length; //from super
        perimeter = 2*(width+length); //from super
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
     * returns name and details of rectangle
     * @return 
     */
    @Override
    public String toString(){
        String str = "Rectangle: Upper left corner at: "+upperLeftPt.toString()+" ,"+" Width: "+width+" Length: "+length+" Area: "+area+" Perimeter: "+perimeter;
        return str;
    }
    
}
