/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java24july;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class sortascending {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter size of an array:");
        int n=obj.nextInt();
        System.out.println("Array:");
        for(int i=0;i<n;i++)
        {
          a[i]=obj.nextInt();  
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
    
}
