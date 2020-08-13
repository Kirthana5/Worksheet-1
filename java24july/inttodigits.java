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
public class inttodigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=obj.nextInt();
        int temp=num,dig,i=0;
        int a[]=new int[10];
        
        for(;temp!=0;i++)
        {
            dig=temp%10;
            temp=temp/10;
            a[i]=dig;
            
        }
        System.out.println("After breaking into digits:");

        for(int j=i-1;j>=0;j--)
        {
            System.out.println(" "+a[j]);
        }   

        
        
    }
    
}
