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
public class calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int a=10;
       int b=2;
       System.out.println("Specify your operation:");
       char c=obj.next().charAt(0);
       switch(c)
       {
           case '+':
               System.out.println(a+b);
               break;
            case '-':
               System.out.println(a-b);
               break;
            case '*':
               System.out.println(a*b);
               break;
            case '/':
               System.out.println(a/b);
               break;   
            default:
               System.out.println("Undefined operation!!");
               break;   
       }
// TODO code application logic here
    }
    
}
