/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java24july;

import java.util.Scanner;/**
 *
 * @author ELCOT
 */
public class bigamongthree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter 3 numbers:");
       int a=obj.nextInt();
       int b=obj.nextInt();
       int c=obj.nextInt();
       if(a>b && a>c)
           System.out.println(""+a+" is greatest");
       else if(b>a && b>c)
           System.out.println(""+b+" is greatest");
       else
           System.out.println(""+c+" is greatest");
 
 
 
 // TODO code application logic here
    }
    
}
