package cecs277ipi.CECS277IPI;

import java.util.Arrays; 

/**
 * driver class, create 3 geometric objects then sort them
 * @author Naveene Raya Carlos Alvarenga
 * @date 9/25/19 
 */
public class GeometricObjectRunner {
    public static void main(String args[]){
        
        //Creating Circle object
        Point newCirclePt = new Point(0,0);
        double newCircleRadius = 1.0;
        Circle newCircle = new Circle(newCirclePt, newCircleRadius);
        
        //Creating Rectangle object
        Point newRectPt = new Point(1,1);
        double rectWidth = 20;
        double rectLength = 30;
        Rectangle newRect = new Rectangle(newRectPt, rectWidth, rectLength);
        
        //Creating Triangle object
        Point newTriPt1 = new Point(1,0);
        Point newTriPt2 = new Point(-1,0);
        Point newTriPt3 = new Point(0,1);
        Triangle newTri = new Triangle(newTriPt1, newTriPt2, newTriPt3);
        
        //Creating and populating GeometricObject array
        GeometricObject arr[] = {newCircle, newRect, newTri};
        
        
        //Printing data
        System.out.println("Before the sort");
        
        int arraySize = 3;
        for(int i = 0; i<arraySize; i++){
            System.out.println(arr[i]);
        }
        
        Arrays.parallelSort(arr);     //parallel sort
    
        
        System.out.println("\nAfter the sort");
        
        for(int i = 0; i<arraySize; i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("\nLargest found was: " +arr[arraySize-1]);
    }
}
