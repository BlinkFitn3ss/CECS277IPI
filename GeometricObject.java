package cecs277ipi.CECS277IPI;


/**
 * Base class for all types of shapes. Abstract
 * @author Naveene Raya Carlos Alvarenga
 * @date 9/18/19
 */
public abstract class GeometricObject implements Comparable<GeometricObject>{
    
    /**
     *
     * @return
     */
    
    // Area and perimeter will be used by toString() for each shape.
    double area;
    double perimeter;
    
    public abstract double Area();
 
    /**
     *
     * @return
     */
    public abstract double Perimeter();
 
    /**
     * Overrides toString in Object class MOAC 
     * @return string of object name
     */
    @Override
    public abstract String toString();
    

    
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
     * compares to GeometricObjects returns the bigger one
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
