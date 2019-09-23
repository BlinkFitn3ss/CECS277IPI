package cecs277ipi.CECS277IPI;

/**
 * Base class for all types of shapes. Abstract
 * @author Naveene Raya Carlos Alvarenga
 * @date 9/18/19
 */
public abstract class GeometricObject {
    
    /**
     *
     * @return
     */
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
}
