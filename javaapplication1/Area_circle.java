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
public class Area_circle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        int r=sc.nextInt();
        double area,perimeter;
        float pi=3.14f;
        area=pi*r*r;
        perimeter=2*pi*r;
        System.out.println("Area of circle is:" +area );
        System.out.println("Perimeter of circle is :" +perimeter);
       
    }
    
}
