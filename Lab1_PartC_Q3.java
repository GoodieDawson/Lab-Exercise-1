/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_partc;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author Albert Kyei
 */
public class Lab1_PartC_Q3 {
    
    /**
     * 
     * @param value
     * @param decimalPlaces
     * @return 
     * 
     * method for rounding to decimal places
     */
    public static double round(double value, int decimalPlaces){
        
        //Throwing error in case of invalid number of decimal places
        if (decimalPlaces < 0) throw new IllegalArgumentException();
        
        //storing value as BigDecimal
        BigDecimal bigdecValue = new BigDecimal(value);
        
        //Rounding BigDecimal value
        bigdecValue = bigdecValue.setScale(decimalPlaces, RoundingMode.HALF_UP);
        
        //Returning rounded value
        return bigdecValue.doubleValue();
    }
    
    /**
     * 
     * method to generate radius and circumference of circle with given radius
     */
    public static void circleInfo(){
        
        //Printing instructions for user
        System.out.println("Kindly input radius of a circle to obtain its area and circumference (rounded to 2 decimal places): ");
        
        //Creating Scanner object to take input
        Scanner newfloatScan = new Scanner(System.in);
        
        //Taking float input from user
        float radius = newfloatScan.nextFloat();
        
        //Closing Scanner
        newfloatScan.close();
        
        //variable for area of circle
        double area = round(Math.PI*Math.pow(radius, 2), 2);
        
        //variable for circumference of circle
        double circumference = round(2*Math.PI*radius, 2);
        
        //Printing information of circle's area
        System.out.println("Area of circle with radius " + radius + ": " + area);
        
        //Printing information of circle's area
        System.out.println("Circumference of circle with radius " + radius + ": " + circumference);
        
    }
    
    public static void main(String[] args){
        
        circleInfo();
        
    }
    
}
