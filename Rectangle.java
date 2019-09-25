package cecs277ipi.CECS277IPI;

/**
 * Location of the upper left corner
 * Width (must be > 0)
 * Length (must be > 0)
 * @author Naveene Raya Carlos Alvarenga
 * @date 9/18/19
 */
public class Rectangle {
    
    /**
     *
     * @param upperLeftPt
     */
    
    Point upperLeftPt;
    double width;
    double length;
    
    double area;
    double perimeter;
    
    public Rectangle(Point upperLeftPt_, double width_, double length_){
        upperLeftPt = upperLeftPt_;
        width = width_;
        length = length_;
        area = width*length;
        perimeter = 2*(width+length);
    }
    
    @Override
    public doubleArea(){
        return area;
    }
    
    @Override
    public double Perimeter(){
        return perimeter;
    }
    
    @Override
    public String toString(){
        String str = "Rectangle: Upper left corner at: "+upperLeftPt.toString()+" ,"+" Width: "+width+" Length: "+length+" Area: "+area+" Perimeter: "+perimeter;
    }
}
