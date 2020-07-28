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
public class powofnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the base and power:");
        int base=obj.nextInt();
        int exp=obj.nextInt();
        int pow=1;
        System.out.println(""+base+" to the power of  "+exp+" is: ");
        while(exp!=0)
        {
            pow=pow*base;
            exp--;
        }
        System.out.println(pow);
    }
    
}
