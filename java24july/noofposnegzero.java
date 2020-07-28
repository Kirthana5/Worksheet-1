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
public class noofposnegzero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int pos=0,neg=0,zero=0;
        System.out.println("Enter value of n:");
        int n=obj.nextInt();
        System.out.println("Enter numbers:");
        for(int i=1;i<=n;i++)
        {
         int a=obj.nextInt();
         if(a>0)
             pos++;
         else if(a<0)
             neg++;
         else
             zero++;
             
        }
        System.out.println("There are  "+pos+" positive numbers  "+neg+" negative numbers and  "+zero+" zeros");
        
    }
    
}
