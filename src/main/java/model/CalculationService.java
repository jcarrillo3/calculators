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
    private final double PI = 3.14159265359;
    private final String ERROR_MSG = "Length and/or Width are invalid values.";
    
    public final double getAreaOfRectangle(String len, String wid) throws IllegalArgumentException{
        if (len == null || len.isEmpty() || wid == null || wid.isEmpty()){
            throw new IllegalArgumentException(ERROR_MSG);
        }
        double length = Double.valueOf(len);
        double width = Double.valueOf(wid);
        
        return length * width;
    }
    
    public final double getAreaOfCircle(String rad) throws IllegalArgumentException{
        if (rad == null || rad.isEmpty()){
            throw new IllegalArgumentException(ERROR_MSG);
        }
        double radius = Double.valueOf(rad);
        
        return PI * (radius*radius);
    }
    
    public final double getHypotenuse(String sideA, String sideB) throws IllegalArgumentException{
        if (sideA == null || sideA.isEmpty() || sideB == null || sideB.isEmpty()){
            throw new IllegalArgumentException(ERROR_MSG);
        }
        double legA = Double.valueOf(sideA);
        double legB = Double.valueOf(sideB);
        
        return Math.sqrt((legA*legA) + (legB*legB));
    }

    public String getERROR_MSG() {
        return ERROR_MSG;
    }
    
    
}
