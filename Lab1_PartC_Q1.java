/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_partc;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Albert Kyei
 */
public class Lab1_PartC_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Part C, Question1
        
        //Creating Scanner object to take input
        Scanner newScan = new Scanner(System.in);
        
        //Printing instructions for user
        System.out.println("Kindly input any string to recieve output of the string's length.\n");
        
        //Taking line input from user
        String input = newScan.nextLine();
        
        //Storing length of given string
        int strLength = input.length();
        
        //Output of string length
        System.out.println("Length of '" + input + "': " + strLength);
    
        //Scanner closed
        newScan.close();
    }
    
    
}
