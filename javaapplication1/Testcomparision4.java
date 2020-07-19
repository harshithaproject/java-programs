/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author activ
 */
import java.util.*;
public class Testcomparision4 {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the strings:");
        String s1=sc.next();
        String s2=sc.next();
        String s3= new String("Ratan");
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareTo(s1));
        
    }
     
    
}
