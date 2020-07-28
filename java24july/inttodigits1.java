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
public class inttodigits1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=obj.nextInt();
        int temp=num,count=0,dig;
        int a[]=new int[10];
        while(num!=0)
        {
            num/=10;
            count++;
        }
        for(;temp!=0;count--)
        {
            dig=temp%10;
            System.out.println("Digit at "+count+"th position: "+dig);
            temp=temp/10;
            
        }
          
    }
    
}
