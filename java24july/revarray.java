/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java24july;
import java.util.*;
/**
 *
 * @author ELCOT
 */
public class revarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int a[]=new int[10];
        int n=obj.nextInt();
        System.out.println("Array:");
        for(int i=0;i<n;i++)
        {
          a[i]=obj.nextInt();  
        }
        System.out.println("Reverse of an array");
        for(int i=n-1;i>=0;i--)
        {
          System.out.print("  "+(a[i])); 
        }
   }
    
}
