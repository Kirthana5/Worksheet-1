/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java24july;
import java.util.*;
/**
 
 * @author ELCOT
 */
public class fibonacciseries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=0;
        int b=1;
        int c;
        System.out.println("Enter the number of terms:");
        int n=obj.nextInt();
        int i;
        System.out.println("Fibonacci series of  "+n+" terms:");
        for(i=1;i<=n;i++)
        {
         System.out.println(""+a);
          c=a+b;
          a=b;
          b=c;
        }
    }
    
}
