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
public class disbwpts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter point 1:");
        float x1=obj.nextFloat();
        float x2=obj.nextFloat();
        System.out.println("Enter point 2:");
        float y1=obj.nextFloat();
        float y2=obj.nextFloat();
        double dis=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println(""+dis);
// TODO code application logic here
    }
    
}
