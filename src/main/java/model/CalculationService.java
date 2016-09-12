/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jcarl
 */
public class CalculationService {
    private final double pi = 3.14159265359;
    
    public final double getAreaOfRectangle(String len, String wid){
        double length = Double.valueOf(len);
        double width = Double.valueOf(wid);
        
        return length * width;
    }
    
    public final double getAreaOfCircle(String rad){
        double radius = Double.valueOf(rad);
        
        return pi * (radius*radius);
    }
    
    public final double getHypotenuse(String sideA, String sideB){
        double legA = Double.valueOf(sideA);
        double legB = Double.valueOf(sideB);
        
        return Math.sqrt((legA*legA) + (legB*legB));
    }
}
