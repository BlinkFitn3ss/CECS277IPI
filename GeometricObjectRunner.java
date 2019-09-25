package cecs277ipi.CECS277IPI;

import java.util.Arrays; 

/**
 *
 * @author Naveene Raya Carlos Alvarenga
 * @date 9/18/19 
 */
public class GeometricObjectRunner {
    public static void main(String args[]){
        
        Point newCirclePt = new Point(0,0);
        double newCircleRadius = 1.0;
        Circle newCircle = new Circle(newCirclePt, newCircleRadius);
        
        Point newRectPt = (1,1);
        double rectWidth = 2;
        double rectLength = 3;
        Rectangle newRect = new Rectangle(newRectPt, rectWidth, rectLength);
        
        Point newTriPt1 = (1,0);
        Point newTriPt2 = (-1,0);
        Point newTriPt3 = (0,1);
        Triangle newTri = new Triangle(newTriPt1, newTriPt2, newTriPt3);
        
        GeometricObject arr[] = {newCircle, newRect, newTri};
        Arrays.parallelSort(arr);
        
        int arraySize = 3;
        for(int i = 0; i<arraySize; i++){
            System.out.println(arr[i]);
        }
    }
}
