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
import java .util.*;
public class Testingcomparision {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the strings:");
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        String s4 = sc.next();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s4));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        
    }
    
}
