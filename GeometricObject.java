package cecs277ipi.CECS277IPI;


/**
 * Base class for all types of shapes. Abstract
 * @author Naveene Raya Carlos Alvarenga
 * @date 9/25/19
 */
public abstract class GeometricObject implements Comparable<GeometricObject>{

    
    // Area and perimeter will be used by toString() for each shape.
    double area;
    double perimeter;
    
    /**
     * abstract function for Area
     * @return
     */
    public abstract double Area();
 
    /**
     * abstract function for Perimeter
     * @return
     */
    public abstract double Perimeter();
 
    /**
     * Overrides toString in Object class MOAC 
     * @return string of object name
     */
    @Override
    public abstract String toString();
    
    /**
     * function compares to geometric objects, returns -1 if greater than, 1 if less than, or 0 if equal
     * @param compareObj
     * @return
     */
    @Override
    public int compareTo(GeometricObject compareObj){
        if(area<compareObj.Area()){
            return -1;
        }
        else if (area>compareObj.Area()){
            return 1;
        }
        else
            return 0;
    }
    
    /**
     * compares to GeometricObjects returns the bigger one, in case of tie returns first input
     * @param geo1
     * @param geo2
     * @return the Geometric object that is bigger
     */
    public static GeometricObject Max(GeometricObject geo1, GeometricObject geo2){
        
        switch(geo1.compareTo(geo2)){
            case 1:
                return geo1;
            case -1:
                return geo2;
            case 0:
                return geo1;
            default:
                return geo1;
        }
    }
}
