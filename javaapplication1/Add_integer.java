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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           public class Add_integer{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
       System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Multiplication table of"+num);
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"=" +num*i);
        }
       
    }
}