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
public class cgpacalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        float gsum=0,csum=0;
        float grade[]=new float[5];
        float credit[]=new float[5];
        System.out.println("Enter the number of subjects:");
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Grade and Credit of "+(i+1)+" subject:");
            grade[i]=obj.nextFloat();
            credit[i]=obj.nextFloat();
            gsum+=grade[i]*credit[i];
            csum+=credit[i];
          
        }
        System.out.println("CGPA: "+(gsum/csum));
        
   }
    
}
