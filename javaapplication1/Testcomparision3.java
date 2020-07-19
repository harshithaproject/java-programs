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
public class Testcomparision3 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the two strings:");
        String s1=sc.next();
        String s2=sc.next();
        String s3= new String("Sachin");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
        
    
}
