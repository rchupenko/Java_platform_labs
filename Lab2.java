/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.lang.Math;
/**
 *
 * @author Notebook
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x = Math.random() * 10;
        double y = Math.random() * 10;
        System.out.format("%.3f%n", x);
        System.out.format("%.3f%n", y);
        if ((x >= 0) && (y <= 10 * Math.sin(x))) 
            System.out.println("vhodit");
        else System.out.println("ne vhodit");
        
        
        
        
    }
    
}
