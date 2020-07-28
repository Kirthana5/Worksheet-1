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
public class pdtdiscount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the amount:");
        double amt=obj.nextDouble();
        System.out.println("Enter the discount %:");
        double dis=obj.nextDouble();
        double disamt=(amt*dis)/100;
        System.out.println("amount after discount:Rs."+(amt-disamt));

        }
}
    

