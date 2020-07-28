/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java24july;

import java.util.Scanner;/**
 *perimeter of square=4a
 * @author ELCOT
 */
public class peri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner per=new Scanner(System.in);
       System.out.println("Enter value of a:");
       float a=per.nextFloat();
       System.out.println("Perimeter of square of side "+a+" is "+(4*a));// TODO code application logic here
    }
    
}
