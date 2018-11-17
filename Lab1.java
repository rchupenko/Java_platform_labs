/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


import java.lang.Math;

/**
 *
 * @author Notebook
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = Math.random() * 20;
        double y = Math.random() * 4000;
        System.out.println("точка");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        if ((x >= 0) && (y >= Math.pow(3, x))) System.out.println(" vhodit");
        else System.out.println(" ne vhodit");
        }

}
